package com.pagoda.bgkj.config;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyPreFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.springframework.web.servlet.config.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.alibaba.fastjson.util.IOUtils.UTF8;

/**
 * Web配置
 *
 * @author PagodaGenerator
 * @generated
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

  public static final String CLASS = "class";

  /**
   * 支持前端跨域访问
   *
   * @param registry
   */
  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry
        .addMapping("/**")
        .allowedHeaders("*")
        .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
        .maxAge(3600)
        .allowCredentials(true)
        .allowedOrigins("*");
  }

  /**
   * 请求日志
   *
   * @return
   */
  @Bean
  public CommonsRequestLoggingFilter requestLoggingFilter() {
    CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
    filter.setIncludeClientInfo(true);
    filter.setIncludeQueryString(true);
    filter.setIncludePayload(true);
    filter.setMaxPayloadLength(10000);
    filter.setIncludeHeaders(true);
    return filter;
  }

  /**
   * 自定义FastJon转换Api返回对象
   *
   * @param converters
   */
  @Override
  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
    converter.setSupportedMediaTypes(
        Arrays.asList(
            new MediaType("application", "json", UTF8),
            new MediaType("application", "*+json", UTF8)));
    // 自定义配置，不序列化class属性
    FastJsonConfig config = new FastJsonConfig();
    PropertyPreFilter classFilter =
        new PropertyPreFilter() {

          @Override
          public boolean apply(JSONSerializer serializer, Object object, String name) {
            if (CLASS.equalsIgnoreCase(name)) {
              return false;
            }
            return true;
          }
        };
    config.setSerializeFilters(classFilter);
    converter.setFastJsonConfig(config);
    converters.add(converter);
  }
}

package com.pagoda.bgkj.config;

import static com.alibaba.fastjson.util.IOUtils.UTF8;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyPreFilter;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.springframework.context.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Web配置
 *
 * @author PagodaGenerator
 * @generated
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

  @Autowired private ApplicationProperties applicationProperties;

  /** 返回前端数据中忽略class属性 */
  protected static final String CLASS = "class";

  protected static final String DATE_FORMAT = "yyyy-MM-dd";

  protected static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

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
    filter.setIncludeClientInfo(applicationProperties.isIncludeClientInfo());
    filter.setIncludeQueryString(applicationProperties.isIncludeQueryString());
    filter.setIncludePayload(applicationProperties.isIncludePayload());
    filter.setIncludeHeaders(applicationProperties.isIncludeHeaders());
    filter.setMaxPayloadLength(applicationProperties.getMaxPayloadLength());
    filter.setAfterMessagePrefix("REQUEST DATA : ");
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
    SerializeConfig mapping = new SerializeConfig();
    mapping.put(java.util.Date.class, new SimpleDateFormatSerializer(DATE_FORMAT));
    mapping.put(java.sql.Date.class, new SimpleDateFormatSerializer(DATE_FORMAT));
    mapping.put(java.sql.Timestamp.class, new SimpleDateFormatSerializer(DATE_TIME_FORMAT));
    config.setSerializeConfig(mapping);
    config.setSerializeFilters(classFilter);
    converter.setFastJsonConfig(config);
    converters.add(converter);
  }
}

package com.pagoda.user.config;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.*;
import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 从spring boot配置文件加载参数
 *
 * @author PagodaGenerator generated
 */
@Component
@Data
public class ApplicationProperties implements InitializingBean {

  /** inject config for namespace application */
  @ApolloConfig private Config config;

  /** 服务部署地址 */
  @Value("${server.baseUrl}")
  private String baseUrl;

  /** 上传文件保存的文件夹 */
  @Value("${uploadFolder:tmp/upload/}")
  private String uploadFolder;

  /** org.springframework.web.filter.CommonsRequestLoggingFilter配置，日志是否包含url查询参数 */
  @Value("${requestLogging.includeQueryString:true}")
  private boolean includeQueryString;

  /**
   * org.springframework.web.filter.CommonsRequestLoggingFilter配置，日志是否包含client address和session id
   */
  @Value("${requestLogging.includeClientInfo:true}")
  private boolean includeClientInfo;

  /** org.springframework.web.filter.CommonsRequestLoggingFilter配置，日志是否包含http请求header */
  @Value("${requestLogging.includeHeaders:true}")
  private boolean includeHeaders;

  /** org.springframework.web.filter.CommonsRequestLoggingFilter配置，日志是否包含http请求body */
  @Value("${requestLogging.includePayload:true}")
  private boolean includePayload;

  /** org.springframework.web.filter.CommonsRequestLoggingFilter配置，日志打印http请求body的最大长度 */
  @Value("${requestLogging.maxPayloadLength:10000}")
  private int maxPayloadLength;

  @Override
  public void afterPropertiesSet() throws Exception {
    String value = config.getProperty("hello", "not_found");
    System.out.println("--->" + value);
  }

  /**
   * config change listener for namespace application
   *
   * @param changeEvent
   */
  @ApolloConfigChangeListener
  private void apolloConfigChange(ConfigChangeEvent changeEvent) {
    if (changeEvent.isChanged("hello")) {
      String value = config.getProperty("hello", "not_found");
      System.out.println("--->" + value);
    }
  }
}

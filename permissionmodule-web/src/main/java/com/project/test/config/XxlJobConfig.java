package com.project.test.config;

import com.xxl.job.core.executor.XxlJobExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * xxl-job config
 *
 * @author PagodaGenerator
 * @generated
 */
@Slf4j
@Configuration
@ConditionalOnProperty(name = "xxl.job.enabled", havingValue = "true", matchIfMissing = false)
// @ComponentScan(basePackages = "com.project.test.service")
public class XxlJobConfig {

  /*
      @Value("${xxl.job.admin.addresses}")
      private String adminAddresses;

      @Value("${xxl.job.executor.appname}")
      private String appName;

      @Value("${xxl.job.executor.ip:localhost}")
      private String ip;

      @Value("${xxl.job.executor.port:9999}")
      private int port;

      @Value("${xxl.job.accessToken}")
      private String accessToken;

      @Value("${xxl.job.executor.logpath}")
      private String logPath;

      @Value("${xxl.job.executor.logretentiondays:-1}")
      private int logRetentionDays;
  */

  @Bean(initMethod = "start", destroyMethod = "destroy")
  @ConditionalOnMissingBean
  @ConfigurationProperties(prefix = "xxl.job")
  public XxlJobExecutor xxlJobExecutor() {
    log.info(">>>>>>>>>>> xxl-job config init.");
    XxlJobExecutor xxlJobExecutor = new XxlJobExecutor();
    /*
            xxlJobExecutor.setAdminAddresses(adminAddresses);
            xxlJobExecutor.setAppName(appName);
            xxlJobExecutor.setIp(ip);
            xxlJobExecutor.setPort(port);
            xxlJobExecutor.setAccessToken(accessToken);
            xxlJobExecutor.setLogPath(HlogPath);
            xxlJobExecutor.setLogRetentionDays(logRetentionDays);
    */
    return xxlJobExecutor;
  }
}

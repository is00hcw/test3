package com.project.test.service.config;

import com.xxl.job.core.executor.XxlJobExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.condition.*;

/**
 * xxl-job config
 *
 * @author PagodaGenerator
 * @generated
 */
@Configuration
@ConditionalOnProperty(name = "xxl.job.enabled", havingValue = "true", matchIfMissing = false)
// @ComponentScan(basePackages = "com.project.test.service")
public class XxlJobConfig {
  private Logger logger = LoggerFactory.getLogger(XxlJobConfig.class);

  @Value("${xxl.job.admin.addresses}")
  private String adminAddresses;

  @Value("${xxl.job.executor.appname}")
  private String appName;

  @Value("${xxl.job.executor.ip}")
  private String ip;

  @Value("${xxl.job.executor.port}")
  private int port;

  @Value("${xxl.job.accessToken}")
  private String accessToken;

  @Value("${xxl.job.executor.logpath}")
  private String logPath;

  @Value("${xxl.job.executor.logretentiondays}")
  private int logRetentionDays;

  @ConditionalOnMissingBean
  @Bean(initMethod = "start", destroyMethod = "destroy")
  public XxlJobExecutor xxlJobExecutor() {
    logger.info(">>>>>>>>>>> xxl-job config init.");
    XxlJobExecutor xxlJobExecutor = new XxlJobExecutor();
    xxlJobExecutor.setAdminAddresses(adminAddresses);
    xxlJobExecutor.setAppName(appName);
    xxlJobExecutor.setIp(ip);
    xxlJobExecutor.setPort(port);
    xxlJobExecutor.setAccessToken(accessToken);
    xxlJobExecutor.setLogPath(logPath);
    xxlJobExecutor.setLogRetentionDays(logRetentionDays);

    return xxlJobExecutor;
  }
}

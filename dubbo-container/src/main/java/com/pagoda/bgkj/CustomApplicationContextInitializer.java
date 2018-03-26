package com.pagoda.bgkj;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.*;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Spring Boot 启动过程定制化
 *
 * @author PagodaGenerator
 * @generated
 */
@Slf4j
public class CustomApplicationContextInitializer
    implements ApplicationContextInitializer, ApplicationListener {

  @Override
  public void initialize(ConfigurableApplicationContext applicationContext) {
    log.info("自定义的初始化器的initialize方法被执行了");
    // apollo配置中心，env指定查找参数的环境
    String apolloEnv = applicationContext.getEnvironment().getProperty("apollo.env");
    System.setProperty("env", apolloEnv);
  }

  @Override
  public void onApplicationEvent(ApplicationEvent event) {
    // 监听ApplicationStartingEvent
    if (event instanceof ApplicationStartedEvent) {
      log.info("ApplicationStartedEvent listened");
    }

    // 监听ApplicationEnvironmentPreparedEvent
    else if (event instanceof ApplicationEnvironmentPreparedEvent) {
      log.info("ApplicationEnvironmentPreparedEvent listened");
    }

    // 监听ApplicationPreparedEvent
    else if (event instanceof ApplicationPreparedEvent) {
      log.info("ApplicationPreparedEvent listened");
    }

    // 监听ApplicationReadyEvent
    else if (event instanceof ApplicationReadyEvent) {
      log.info("ApplicationReadyEvent listened");
    }

    // 监听ApplicationFailedEvent
    else if (event instanceof ApplicationFailedEvent) {
      log.info("ApplicationFailedEvent listened");
    }
  }
}

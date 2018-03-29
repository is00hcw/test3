package com.pagoda.user;

import com.alibaba.dcm.DnsCacheManipulator;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.boot.context.event.*;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Spring Boot 启动过程定制化
 *
 * @author PagodaGenerator
 * @generated
 */
@Slf4j
public class CustomApplicationContextInitializer
    implements ApplicationContextInitializer, ApplicationListener {

  public static final String LOCALHOST = "localhost";
  public static final String APOLLO_DEFAULT_ENV_VALUE = "DEV";
  public static final String APOLLO_ENV = "env";
  public static final String APOLLO_SERVER = "apolloServer";
  public static final String APOLLO_SERVER_CONFIG = "apollo.server";
  public static final String APOLLO_ENV_CONFIG = "apollo.env";

  @Override
  public void initialize(ConfigurableApplicationContext applicationContext) {
    log.info("自定义的初始化器的initialize方法被执行了");
    try {
      ConfigurableEnvironment environment = applicationContext.getEnvironment();
      // apollo配置中心，env指定查找参数的环境
      String apolloEnv = environment.getProperty(APOLLO_ENV_CONFIG);
      if (StringUtils.isEmpty(apolloEnv)) {
        apolloEnv = APOLLO_DEFAULT_ENV_VALUE;
      }
      System.setProperty(APOLLO_ENV, apolloEnv);
      String applloServer = environment.getProperty(APOLLO_SERVER_CONFIG);
      if (StringUtils.isEmpty(applloServer)) {
        applloServer = LOCALHOST;
      }
      DnsCacheManipulator.setDnsCache(APOLLO_SERVER, applloServer);
    } catch (Exception e) {
      log.error("CustomApplicationContextInitializer.initialize", e);
    }
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

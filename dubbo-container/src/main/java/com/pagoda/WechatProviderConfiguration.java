package com.pagoda;

import com.pagoda.config.*;
import com.pagoda.platform.dubbo.annotation.*;
import com.pagoda.platform.jms.jpa.*;

import com.alibaba.dubbo.config.ApplicationConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author PagodaGenerator
 * @generated
 */
@Configuration
@ImportResource(value = {"classpath*:META-INF/spring/*.xml"})
@ComponentScan({"com.pagoda.service", "com.pagoda.repo", "com.pagoda.config"})
@DubboServiceScan("com.pagoda.service")
@EnableJpaRepositories(
  basePackages = "com.pagoda.repo",
  repositoryBaseClass = PagodaJpaRepositoryImpl.class,
  repositoryFactoryBeanClass = PagodaJpaRepositoryFactoryBean.class
)
public class WechatProviderConfiguration {}

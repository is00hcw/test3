package com.pagoda.user;

import com.pagoda.user.config.*;
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
@ComponentScan({"com.pagoda.user.service", "com.pagoda.user.repo", "com.pagoda.user.config"})
@DubboServiceScan("com.pagoda.user.service")
@EnableJpaRepositories(
  basePackages = "com.pagoda.user.repo",
  repositoryBaseClass = PagodaJpaRepositoryImpl.class,
  repositoryFactoryBeanClass = PagodaJpaRepositoryFactoryBean.class
)
public class UserProviderConfiguration {}

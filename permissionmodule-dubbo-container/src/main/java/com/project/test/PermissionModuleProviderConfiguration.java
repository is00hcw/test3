package com.project.test;

import com.project.test.config.*;
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
@ComponentScan({"com.project.test.service", "com.project.test.repo", "com.project.test.config"})
@DubboServiceScan("com.project.test.service")
@EnableJpaRepositories(
  basePackages = "com.project.test.repo",
  repositoryBaseClass = PagodaJpaRepositoryImpl.class,
  repositoryFactoryBeanClass = PagodaJpaRepositoryFactoryBean.class
)
public class PermissionModuleProviderConfiguration {}

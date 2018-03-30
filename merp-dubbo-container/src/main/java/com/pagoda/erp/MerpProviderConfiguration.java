package com.pagoda.erp;

import com.pagoda.erp.config.*;
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
@ComponentScan({"com.pagoda.erp.service", "com.pagoda.erp.repo", "com.pagoda.erp.config"})
@DubboServiceScan("com.pagoda.erp.service")
@EnableJpaRepositories(
  basePackages = "com.pagoda.erp.repo",
  repositoryBaseClass = PagodaJpaRepositoryImpl.class,
  repositoryFactoryBeanClass = PagodaJpaRepositoryFactoryBean.class
)
public class MerpProviderConfiguration {}

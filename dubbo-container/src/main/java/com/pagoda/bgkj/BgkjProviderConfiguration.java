package com.pagoda.bgkj;

import com.pagoda.bgkj.config.*;
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
@ComponentScan({"com.pagoda.bgkj.service", "com.pagoda.bgkj.repo", "com.pagoda.bgkj.config"})
@DubboServiceScan("com.pagoda.bgkj.service")
@EnableJpaRepositories(
  basePackages = "com.pagoda.bgkj.repo",
  repositoryBaseClass = PagodaJpaRepositoryImpl.class,
  repositoryFactoryBeanClass = PagodaJpaRepositoryFactoryBean.class
)
public class BgkjProviderConfiguration {}

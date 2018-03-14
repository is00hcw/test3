package com.pagoda.config;

import com.pagoda.platform.jms.jpa.*;
import org.springframework.context.annotation.*;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.data.domain.AuditorAware;

/**
 * JPA配置
 *
 * @author PagodaGenerator
 * @generated
 */
@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
@ComponentScan({"com.pagoda.domain", "com.pagoda.repo"})
@EnableJpaRepositories(
  basePackages = "com.pagoda.repo",
  repositoryBaseClass = PagodaJpaRepositoryImpl.class,
  repositoryFactoryBeanClass = PagodaJpaRepositoryFactoryBean.class
)
public class DaoConfig {

  /**
   * 审计时获取操作的用户身份
   *
   * @return
   */
  @Bean
  AuditorAware<String> auditorProvider() {
    return new AuditorAware() {
      @Override
      public String getCurrentAuditor() {
        // TODO
        return "unknown_user";
      }
    };
  }
}

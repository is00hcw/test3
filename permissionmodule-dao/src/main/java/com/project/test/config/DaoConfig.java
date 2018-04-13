package com.project.test.config;

import com.pagoda.platform.jms.jpa.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
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
@ComponentScan({"com.project.test.domain", "com.project.test.repo", "com.pagoda.platform.jms.util"})
@EnableJpaRepositories(
  basePackages = "com.project.test.repo",
  repositoryBaseClass = PagodaJpaRepositoryImpl.class,
  repositoryFactoryBeanClass = PagodaJpaRepositoryFactoryBean.class
)
public class DaoConfig {

  /**
   * 审计时获取操作的用户身份,此处返回假数据，应该有由dubbo服务从上下文中获取
   *
   * @return
   */
  @Bean
  @ConditionalOnMissingBean
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

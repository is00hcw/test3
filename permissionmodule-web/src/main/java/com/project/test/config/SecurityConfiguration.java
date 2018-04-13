package com.project.test.config;

import cn.com.pagoda.common.shiro.subject.PagodaSubject;
import org.apache.shiro.SecurityUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;

/**
 * 权限配置
 *
 * @author PagodaGenerator
 * @generated
 */
public class SecurityConfiguration {

  /**
   * 审计时获取操作的用户身份, 没有启用dubbo时，单体部署直接返回用户身份。
   * 启用dubbo时，通过com.pagoda.platform.dubbo.consumer.ConsumerFilter和com.pagoda.platform.dubbo.provider.ProviderFilter进行上下文传递
   *
   * @return
   */
  @Bean
  @ConditionalOnProperty(name = "dubbo.enabled", havingValue = "false", matchIfMissing = false)
  AuditorAware<String> auditorProvider() {
    return new AuditorAware() {
      @Override
      public String getCurrentAuditor() {
        PagodaSubject subject = (PagodaSubject) SecurityUtils.getSubject();
        // 员工号，用于记录操作人
        String employeeCode = subject.getEmployeeCode();
        return employeeCode;
      }
    };
  }
}

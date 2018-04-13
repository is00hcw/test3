package com.project.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import javax.validation.Validator;

/**
 * 数据校验配置类.
 *
 * @author PagodaGenerator
 * @generated
 */
@Configuration
public class ValidationConfiguration {

  @Bean
  @ConditionalOnMissingBean
  public MethodValidationPostProcessor methodValidationPostProcessor(Validator validator) {
    MethodValidationPostProcessor processor = new MethodValidationPostProcessor();
    processor.setValidator(validator);
    return processor;
  }

  @Bean
  @ConditionalOnMissingBean
  public Validator validator() {
    return new LocalValidatorFactoryBean();
  }
}

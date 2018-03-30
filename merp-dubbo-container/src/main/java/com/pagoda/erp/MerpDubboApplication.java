package com.pagoda.erp;

import com.ctrip.framework.apollo.spring.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

// (excludeName={"org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration","org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration"})  // TODO 临时关闭jpa
/**
 * @author PagodaGenerator
 * @generated
 */
@EnableApolloConfig
@SpringBootApplication
public class MerpDubboApplication {

  /**
   * 请求日志
   *
   * @return
   */
  @Bean
  public CommonsRequestLoggingFilter requestLoggingFilter() {
    CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
    filter.setIncludeClientInfo(true);
    filter.setIncludeQueryString(true);
    filter.setIncludePayload(true);
    filter.setMaxPayloadLength(10000);
    filter.setIncludeHeaders(true);
    return filter;
  }

  public static void main(String[] args) throws InterruptedException {
    ApplicationContext context = SpringApplication.run(MerpDubboApplication.class, args);
  }
}

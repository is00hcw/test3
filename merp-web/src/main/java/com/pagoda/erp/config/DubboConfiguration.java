package com.pagoda.erp.config;

import com.pagoda.platform.dubbo.annotation.DubboReferenceScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * Dubbo启用配置，默认激活
 *
 * @author PagodaGenerator
 * @generated
 */
@Configuration
@ConditionalOnProperty(name = "dubbo.enabled", havingValue = "true", matchIfMissing = true)
@ImportResource("classpath*:META-INF/spring/*.xml")
@DubboReferenceScan(
  value = {"com.pagoda.erp.api"},
  scope = "remote"
)
public class DubboConfiguration {

  @ConditionalOnMissingBean
  @Bean
  public DataSource dataSource() {
    return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.HSQL).build();
  }
}

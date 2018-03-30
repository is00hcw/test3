package com.pagoda.erp;

import com.pagoda.erp.config.*;
import com.pagoda.platform.dubbo.annotation.*;
import com.alibaba.dubbo.config.utils.ReferenceConfigCache;
import com.ctrip.framework.apollo.spring.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.boot.autoconfigure.data.redis.*;

/**
 * 临时关闭redis
 *
 * @author PagodaGenerator
 * @generated
 */
@EnableApolloConfig
@SpringBootApplication // (exclude = { RedisAutoConfiguration.class,
                       // RedisRepositoriesAutoConfiguration.class,
                       // HibernateJpaAutoConfiguration.class, DataSourceAutoConfiguration.class})
@ComponentScan({
  "com.pagoda.platform.dubbo.consumer",
  "com.pagoda.platform.dubbo.metadata",
  "com.pagoda.erp"
})
public class MerpWebApplication {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(MerpWebApplication.class, args);
  }
}

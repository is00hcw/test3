package com.pagoda.bgkj.config;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.*;
import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 从spring boot配置文件加载参数
 *
 * @author PagodaGenerator generated
 */
@Component
@Data
public class ApplicationProperties implements InitializingBean {

  /** inject config for namespace application */
  @ApolloConfig private Config config;

  @Override
  public void afterPropertiesSet() throws Exception {
    String value = config.getProperty("hello", "not_found");
    System.out.println("--->" + value);
  }

  /**
   * config change listener for namespace application
   *
   * @param changeEvent
   */
  @ApolloConfigChangeListener
  private void apolloConfigChange(ConfigChangeEvent changeEvent) {
    if (changeEvent.isChanged("hello")) {
      String value = config.getProperty("hello", "not_found");
      System.out.println("--->" + value);
    }
  }
}

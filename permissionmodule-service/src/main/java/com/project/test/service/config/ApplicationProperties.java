package com.project.test.service.config;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 从spring boot配置文件加载参数
 *
 * @author PagodaGenerator generated
 */
@Component("appProps")
@Data
@Slf4j
public class ApplicationProperties implements InitializingBean {

  /** inject config for namespace application */
  @ApolloConfig private Config config;

  /**
   * 返回配置中心的动态配置
   *
   * @param key
   * @param defaultValue
   * @return
   */
  public String getDynamicProperty(String key, String defaultValue) {
    return config.getProperty(key, defaultValue);
  }

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

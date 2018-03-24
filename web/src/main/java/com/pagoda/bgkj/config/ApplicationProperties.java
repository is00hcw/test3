package com.pagoda.bgkj.config;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.*;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 从spring boot配置文件加载参数
 *
 * @author PagodaGenerator generated
 */
@Component
@Data
public class ApplicationProperties {

  /** inject config for namespace application */
  @ApolloConfig private Config config;

  /** 服务部署地址 */
  @Value("${server.baseUrl}")
  private String baseUrl;
}

package com.pagoda.bgkj.service;

import com.pagoda.bgkj.api.*;
import com.pagoda.platform.dubbo.provider.GroovyServiceProxyImpl;

import org.springframework.beans.factory.annotation.*;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.*;

/**
 * 调用groovy脚本
 *
 * @author PagodaGenerator
 * @generated
 */
@Service
public class GroovyServiceImpl extends GroovyServiceProxyImpl implements GroovyService {

  @Autowired private ResourceLoader resourceLoader;

  /**
   * groovy 默认处理，没有找到匹配的groovy文件时调用
   *
   * @return
   */
  @Override
  public String getDefaultGroovyHandler() {
    return "groovyHandler.groovy";
  }

  /**
   * groovy 文件存放目录
   *
   * @return
   */
  @Override
  public String getGroovyFolder() {
    return "/groovy";
  }

  @Override
  public ResourceLoader getResourceLoader() {
    return resourceLoader;
  }
}

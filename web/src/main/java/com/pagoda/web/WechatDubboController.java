package com.pagoda.web;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.annotation.*;
import com.pagoda.platform.dubbo.consumer.DubboGenericInvoker;
import com.pagoda.platform.dubbo.metadata.EntityFeatureInfo;
import com.pagoda.platform.dubbo.metadata.FieldMetaInfo;
import com.pagoda.platform.dubbo.metadata.MetadataService;
import io.micrometer.core.annotation.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

/**
 * 通用的Dubbo调用服务，将Dubbo RPC转换成Rest API
 *
 * @author PagodaGenerator
 * @generated
 */
@Controller
@RequestMapping("dubboAPI")
@Slf4j
public class WechatDubboController {

  /** 调用dubbo rpc */
  @Autowired private DubboGenericInvoker dubboGenericServiceInvoker;

  /** 前端查询元数据 */
  @Autowired private MetadataService metadataService;

  // @FastJsonView(exclude = {@FastJsonFilter(clazz = HashMap.class, props = {"class"})})
  /**
   * 将Dubbo RPC转换成Rest API
   *
   * @param httpRequest
   * @param service 接口的全路径名称（带包名）
   * @param method 要调用的接口方法名
   * @param timeout 超时时间，单位毫秒
   * @param retries 重试次数
   * @return
   * @throws Exception
   */
  @Timed
  @ResponseBody
  @GetMapping(value = "/{service}/{method}")
  public Object getInvokeApi(
      HttpServletRequest httpRequest,
      @PathVariable("service") String service,
      @PathVariable("method") String method,
      @RequestHeader(value = "timeout", required = false, defaultValue = "5000") int timeout,
      @RequestHeader(value = "retries", required = false, defaultValue = "2") int retries)
      throws Exception {
    return dubboGenericServiceInvoker.invokeApi(httpRequest, service, method, timeout, retries);
  }

  /**
   * 将Dubbo RPC转换成Rest API
   *
   * @param httpRequest
   * @param service 接口的全路径名称（带包名）
   * @param method 要调用的接口方法名
   * @param timeout 超时时间，单位毫秒
   * @param retries 重试次数
   * @return
   * @throws Exception
   */
  @Timed
  @ResponseBody
  @PostMapping(value = "/{service}/{method}")
  public Object postInvokeApi(
      HttpServletRequest httpRequest,
      @PathVariable("service") String service,
      @PathVariable("method") String method,
      @RequestHeader(value = "timeout", required = false, defaultValue = "5000") int timeout,
      @RequestHeader(value = "retries", required = false, defaultValue = "2") int retries)
      throws Exception {
    return dubboGenericServiceInvoker.invokeApi(httpRequest, service, method, timeout, retries);
  }

  /**
   * 前端组件查询类型的元数据
   *
   * @param httpRequest
   * @param className 类型的全路径名称（带包名）
   * @return
   */
  @Timed
  @ResponseBody
  @GetMapping(value = "/metadata/{className:.+}")
  public Object metadata(
      HttpServletRequest httpRequest, @PathVariable("className") String className) {
    EntityFeatureInfo classMeta = metadataService.getDtoClassMetadata(className);
    List<FieldMetaInfo> feilds = metadataService.getDtoFieldsMetadata(className);
    JSONObject json = new JSONObject();
    json.put("head", feilds);
    json.put("requestUrl", classMeta.getRequestUrl());
    return json;
  }
}

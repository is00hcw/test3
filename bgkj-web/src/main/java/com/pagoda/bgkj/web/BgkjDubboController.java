package com.pagoda.bgkj.web;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.annotation.*;

import com.pagoda.platform.dubbo.consumer.*;
import com.pagoda.platform.dubbo.metadata.EntityFeatureInfo;
import com.pagoda.platform.dubbo.metadata.FieldMetaInfo;
import com.pagoda.platform.dubbo.metadata.MetadataService;
import cn.com.pagoda.common.shiro.subject.*;

import io.micrometer.core.annotation.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.*;
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
@RequestMapping("/dubboAPI")
@Slf4j
public class BgkjDubboController {

  /** 模块名 * */
  public static final String MODULE_NAME = "Bgkj";

  /** 模块包名 * */
  public static final String MODULE_PACKAGE = "com.pagoda.bgkj";

  /** DTO包名 * */
  public static final String DTO_PACKAGE = "com.pagoda.bgkj.api.dto";

  /** api包名 * */
  public static final String API_PACKAGE = "com.pagoda.bgkj.api";

  /** 查询方法名 * */
  public static final String QUERY_METHOD = "findBy";

  /** 路径分隔符 * */
  public static final String PATH_SEP = "/";

  /** 请求路径 * */
  public static final String REQUEST_PATH = "/dubboAPI";

  /** 调用dubbo rpc */
  @Autowired private DubboGenericInvoker dubboGenericServiceInvoker;

  /** 前端查询元数据 */
  @Autowired private MetadataService metadataService;

  @Value("${dubbo.enabled:true}")
  private boolean dubboEnabled;

  @Autowired private ReflectionInvoker reflectionInvoker;

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
    if (dubboEnabled) {
      return dubboGenericServiceInvoker.invokeApi(httpRequest, service, method, timeout, retries);
    } else {
      return reflectionInvoker.invokeApi(httpRequest, service, method);
    }
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
    if (dubboEnabled) {
      return dubboGenericServiceInvoker.invokeApi(httpRequest, service, method, timeout, retries);
    } else {
      return reflectionInvoker.invokeApi(httpRequest, service, method);
    }
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
    EntityFeatureInfo classMeta = null;
    String serviceClass = "";
    if (className.indexOf('.') > -1) {
      classMeta = metadataService.getDtoClassMetadata(className);
      serviceClass = getApiServiceClass(className);
    } else {
      classMeta = metadataService.getDtoClassMetadata(DTO_PACKAGE, className);
      serviceClass = getApiServiceClass(API_PACKAGE + "." + className);
    }
    List<FieldMetaInfo> feilds = metadataService.getDtoFieldsMetadata(className);
    JSONObject json = new JSONObject();
    json.put("head", feilds);

    String requestUrl = classMeta.getRequestUrl();
    if (StringUtils.isEmpty(requestUrl)) {
      requestUrl = REQUEST_PATH + PATH_SEP + serviceClass + PATH_SEP + QUERY_METHOD;
    }
    json.put("requestUrl", requestUrl);
    json.put("tableMultiSelect", classMeta.isTableMultiSelect());
    return json;
  }

  private String getApiServiceClass(String dtoClass) {
    return dtoClass.replace("DTO", "Service");
  }

  private void checkUserPermission() {
    try {
      PagodaSubject subject = (PagodaSubject) SecurityUtils.getSubject();
      // 用户代码
      String userCode = subject.getUserCode();
      // 员工号，用于记录操作人
      String employeeCode = subject.getEmployeeCode();
      // 部门，用于记录操作人
      String orgCode = subject.getOrgCode();
      System.out.println(userCode);
    } catch (Exception e) {
      log.error("checkUserPermission", e);
    }
  }
}

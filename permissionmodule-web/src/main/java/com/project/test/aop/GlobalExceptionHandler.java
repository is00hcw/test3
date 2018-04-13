package com.project.test.aop;

import com.alibaba.dubbo.rpc.service.GenericException;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;

/**
 * 统一的web异常处理类,
 * 可以继承org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
 *
 * @author ???
 */
@ControllerAdvice
public class GlobalExceptionHandler {

  private final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

  @ExceptionHandler(Exception.class)
  @ResponseBody
  public JSONObject handleAllException(Exception e) {
    String errorMsg = StringUtils.isEmpty(e.getMessage()) ? "系统异常" : e.getMessage();
    if (e instanceof GenericException) {
      // GenericFilter将堆栈转成字符串了
      errorMsg = ((GenericException) e).getExceptionMessage();
    } else if (e instanceof ConstraintViolationException) {
      // 处理验证异常
      Set<ConstraintViolation<?>> validations =
          ((ConstraintViolationException) e).getConstraintViolations();
      if (validations != null) {
        StringBuilder buf = new StringBuilder();
        validations.forEach(validation -> buf.append(validation.getMessage()));
        errorMsg = buf.toString();
      }
    }
    JSONObject result = new JSONObject();
    result.put("errorMsg", errorMsg);
    if (e instanceof IllegalArgumentException || e instanceof ConstraintViolationException) {
      result.put("resultCode", 400);
    } else {
      result.put("resultCode", 500);
    }

    log.error("handleAllException | err={}", e.getMessage());
    return result;
  }
}

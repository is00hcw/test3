package com.pagoda.bgkj.aop;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.UUID;

/**
 * 打日志的时候，添加一些跟踪数据，比如用户id，request id
 *
 * @author ???
 */
@Component
public class RequestTracingFilter implements Filter {

  /**
   * TODO 演示在log中添加用户id，request id
   *
   * @param request
   * @param response
   * @param chain
   * @throws IOException
   * @throws ServletException
   */
  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    try {
      String mdcData = String.format("[userId:%s | requestId:%s] ", user(), requestId());
      // Referenced from logging configuration.
      MDC.put("mdcData", mdcData);
      chain.doFilter(request, response);
    } finally {
      MDC.clear();
    }
  }

  private String requestId() {
    return UUID.randomUUID().toString();
  }

  private String user() {
    return "unknown_user";
  }

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {}

  @Override
  public void destroy() {}
}

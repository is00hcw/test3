package com.pagoda.bgkj.api;

/**
 * 参考com.alibaba.dubbo.rpc.RpcException定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class ServiceException extends RuntimeException {
  public static final int UNKNOWN_EXCEPTION = 0;
  public static final int NETWORK_EXCEPTION = 1;
  public static final int TIMEOUT_EXCEPTION = 2;
  public static final int BIZ_EXCEPTION = 3;
  public static final int FORBIDDEN_EXCEPTION = 4;
  public static final int SERIALIZATION_EXCEPTION = 5;
  private static final long serialVersionUID = 7815426752583648735L;
  /** RpcException cannot be extended, use error code for exception type to keep compatibility */
  private int code;

  public ServiceException() {
    super();
  }

  public ServiceException(String message, Throwable cause) {
    super(message, cause);
  }

  public ServiceException(String message) {
    super(message);
  }

  public ServiceException(Throwable cause) {
    super(cause);
  }

  public ServiceException(int code) {
    super();
    this.code = code;
  }

  public ServiceException(int code, String message, Throwable cause) {
    super(message, cause);
    this.code = code;
  }

  public ServiceException(int code, String message) {
    super(message);
    this.code = code;
  }

  public ServiceException(int code, Throwable cause) {
    super(cause);
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public boolean isBiz() {
    return code == BIZ_EXCEPTION;
  }

  public boolean isForbidded() {
    return code == FORBIDDEN_EXCEPTION;
  }

  public boolean isTimeout() {
    return code == TIMEOUT_EXCEPTION;
  }

  public boolean isNetwork() {
    return code == NETWORK_EXCEPTION;
  }

  public boolean isSerialization() {
    return code == SERIALIZATION_EXCEPTION;
  }
}

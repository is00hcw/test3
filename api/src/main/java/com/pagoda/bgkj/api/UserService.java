package com.pagoda.bgkj.api;

import com.pagoda.bgkj.api.dto.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * user服务接口UserService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Api(value = "User", description = "User api")
public interface UserService extends Remote, BaseUserService {}

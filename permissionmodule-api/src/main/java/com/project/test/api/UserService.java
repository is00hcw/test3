package com.project.test.api;

import com.project.test.api.dto.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 用户服务接口UserService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "User", description = "User api")
public interface UserService extends Remote, BaseUserService {}

package com.project.test.api;

import com.project.test.api.dto.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 权限服务接口PermissionService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "Permission", description = "Permission api")
public interface PermissionService extends Remote, BasePermissionService {}

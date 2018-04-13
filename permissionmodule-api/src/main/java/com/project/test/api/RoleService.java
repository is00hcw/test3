package com.project.test.api;

import com.project.test.api.dto.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 角色服务接口RoleService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "Role", description = "Role api")
public interface RoleService extends Remote, BaseRoleService {}

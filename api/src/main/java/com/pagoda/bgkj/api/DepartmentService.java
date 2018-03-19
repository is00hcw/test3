package com.pagoda.bgkj.api;

import com.pagoda.bgkj.api.dto.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * 部门服务接口DepartmentService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Api(value = "Department", description = "Department api")
public interface DepartmentService extends Remote, BaseDepartmentService {}

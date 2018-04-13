package com.project.test.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pagoda.platform.jms.annotation.*;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import io.swagger.annotations.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@ApiModel(value = "FindSomethingByRoleDTO", description = "根据用户名和角色名查找信息")
@EntityFeature(
  entityName = "FindSomethingByRoleDTO",
  persistent = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class FindSomethingByRoleDTO implements Serializable {
  @FieldMeta(
    name = "name2",
    scene = "Role",
    nameCN = "名称",
    comment = "名称",
    nameEN = "RoleName",
    type = "字符串",
    format = "{}",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = false,
    canQuery = false,
    readOnly = false,
    required = false,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(
    name = "name2",
    value = "名称",
    dataType = "字符串",
    notes = "5ab8963b7c51e0fcf5176eb8"
  )
  private String name2;

  @FieldMeta(
    name = "name1",
    scene = "Role",
    nameCN = "名称",
    comment = "名称",
    nameEN = "RoleName",
    type = "字符串",
    format = "{}",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = false,
    canQuery = false,
    readOnly = false,
    required = false,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(
    name = "name1",
    value = "名称",
    dataType = "字符串",
    notes = "5ab8963b7c51e0fcf5176eb8"
  )
  private String name1;
}

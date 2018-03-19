package com.pagoda.bgkj.api.dto;

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
@ApiModel(value = "FindMemberByDepNameDTO", description = "查询两个表")
@EntityFeature(
  entityName = "FindMemberByDepNameDTO",
  persistent = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class FindMemberByDepNameDTO implements Serializable {
  @FieldMeta(
    name = "name",
    scene = "sys",
    nameCN = "名称",
    nameEN = "name",
    type = "字符串",
    format = "$",
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
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = ""
  )
  @ApiModelProperty(
    name = "name",
    value = "名称",
    dataType = "字符串",
    notes = "5aacc6187c51e0fcf5ff9b07"
  )
  private String name;

  @FieldMeta(
    name = "departmentType",
    scene = "sys",
    nameCN = "部门",
    nameEN = "type",
    type = "整型",
    format = "%",
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
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = ""
  )
  @ApiModelProperty(
    name = "departmentType",
    value = "部门",
    dataType = "整型",
    notes = "5aace47d7c51e0fcf5ffc572"
  )
  private Integer departmentType;

  @FieldMeta(
    name = "age",
    scene = "sys",
    nameCN = "年龄",
    nameEN = "age",
    type = "整型",
    format = "$",
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
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = ""
  )
  @ApiModelProperty(name = "age", value = "年龄", dataType = "整型", notes = "5aacc6377c51e0fcf5ff9b43")
  private Integer age;
}

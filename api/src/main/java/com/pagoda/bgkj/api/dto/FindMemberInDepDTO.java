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
@ApiModel(value = "FindMemberInDepDTO", description = "多表查询取别名")
@EntityFeature(
  entityName = "FindMemberInDepDTO",
  persistent = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class FindMemberInDepDTO implements Serializable {
  @FieldMeta(
    name = "dType",
    scene = "sys",
    nameCN = "部门类型",
    nameEN = "department type",
    type = "字符串",
    format = "xx",
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
    fixed = "",
    sensitive = false
  )
  @ApiModelProperty(
    name = "dType",
    value = "部门类型",
    dataType = "字符串",
    notes = "5ab621577c51e0fcf512aa8a"
  )
  private String dType;

  @FieldMeta(
    name = "age",
    scene = "sys",
    nameCN = "年龄",
    nameEN = "age",
    type = "整型",
    format = "#",
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
    fixed = "",
    sensitive = false
  )
  @ApiModelProperty(name = "age", value = "年龄", dataType = "整型", notes = "5ab61d737c51e0fcf512a01e")
  private Integer age;

  @FieldMeta(
    name = "memberName",
    scene = "sys",
    nameCN = "成员名称",
    nameEN = "member name",
    type = "字符串",
    format = "xx",
    displayLen = 50,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = true,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = true,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "left",
    sensitive = false
  )
  @ApiModelProperty(
    name = "memberName",
    value = "成员名称",
    dataType = "字符串",
    notes = "5ab867467c51e0fcf5175025"
  )
  private String memberName;
}

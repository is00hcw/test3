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
@ApiModel(value = "MemberDTO", description = "成员")
@EntityFeature(
  entityName = "MemberDTO",
  persistent = true,
  batchImport = true,
  treeStyle = true,
  auditable = false,
  traceable = false,
  approvalRequired = true,
  requestUrl = "xxx",
  tableMultiSelect = true
)
public class MemberDTO implements Serializable {

  @FieldMeta(name = "id", nameCN = "主键id", type = "integer")
  @ApiModelProperty(name = "id", value = "主键id", dataType = "long", notes = "")
  private Long id;

  @FieldMeta(name = "deleted", nameCN = "软删除标记", type = "boolean")
  @ApiModelProperty(name = "deleted", value = "软删除标记", dataType = "boolean", notes = "")
  private Boolean deleted;

  @FieldMeta(name = "enabled", nameCN = "是否启用", type = "boolean")
  @ApiModelProperty(name = "enabled", value = "是否启用", dataType = "boolean", notes = "")
  private Boolean enabled;

  @FieldMeta(name = "parentId", nameCN = "父节点id", type = "integer")
  @ApiModelProperty(name = "parentId", value = "父节点id", dataType = "long", notes = "")
  private Long parentId;

  @FieldMeta(name = "approvalStatus", nameCN = "审核状态", type = "integer")
  @ApiModelProperty(name = "approvalStatus", value = "审核状态", dataType = "integer", notes = "")
  private Integer approvalStatus;

  @FieldMeta(name = "approvalAt", nameCN = "审核时间", type = "datetime")
  @ApiModelProperty(name = "approvalAt", value = "审核时间", dataType = "datetime", notes = "")
  private Date approvalAt;

  @FieldMeta(name = "approver", nameCN = "审核人", type = "string")
  @ApiModelProperty(name = "approver", value = "审核人", dataType = "string", notes = "")
  private String approver;

  @FieldMeta(
    name = "depName",
    scene = "sys",
    nameCN = "部门名称",
    nameEN = "department name",
    type = "字符串",
    format = "xx",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    enumerationType = true,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = true
  )
  @ApiModelProperty(
    name = "depName",
    value = "部门名称",
    dataType = "字符串",
    notes = "5ab620e07c51e0fcf512a92e"
  )
  private String depName;

  @FieldMeta(
    name = "memberAge",
    scene = "sys",
    nameCN = "成员年龄",
    nameEN = "member age",
    type = "整型",
    format = "xx",
    displayLen = 20,
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
    enumerationType = true,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = true
  )
  @ApiModelProperty(
    name = "memberAge",
    value = "成员年龄",
    dataType = "整型",
    notes = "5ab867767c51e0fcf5175035"
  )
  private Integer memberAge;

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

  @FieldMeta(
    name = "enumerateMultiple",
    scene = "",
    nameCN = "枚举多选测试",
    nameEN = "enumerateMultiple",
    type = "枚举",
    format = "#",
    displayLen = 1,
    formSize = "",
    constraint = "acc_employee",
    constraintParams = "{\"a\": 4}",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = true,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    enumerationType = true,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false
  )
  @ApiModelProperty(
    name = "enumerateMultiple",
    value = "枚举多选测试",
    dataType = "枚举",
    notes = "5ab854027c51e0fcf5171c29"
  )
  private String enumerateMultiple;

  @FieldMeta(
    name = "enumerate",
    scene = "",
    nameCN = "枚举测试",
    nameEN = "enumerate",
    type = "枚举",
    format = "##",
    displayLen = 1,
    formSize = "",
    constraint = "acc_dc",
    constraintParams = "{\"a\": 1}",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = true,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = true,
    enumerationType = true,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false
  )
  @ApiModelProperty(
    name = "enumerate",
    value = "枚举测试",
    dataType = "枚举",
    notes = "5ab853097c51e0fcf5171b21"
  )
  private String enumerate;

  @FieldMeta(
    name = "mDate",
    scene = "",
    nameCN = "日期",
    nameEN = "date",
    type = "日期",
    format = "#",
    displayLen = 1,
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
    enumerationType = true,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = true
  )
  @ApiModelProperty(
    name = "mDate",
    value = "日期",
    dataType = "日期",
    notes = "5ab854537c51e0fcf5171c89"
  )
  private java.util.Date mDate;

  @FieldMeta(
    name = "mDatetime",
    scene = "",
    nameCN = "时间",
    nameEN = "datetime",
    type = "时间",
    format = "#",
    displayLen = 1,
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
    enumerationType = true,
    constraintParamsExtra = "",
    fixed = "left",
    sensitive = false
  )
  @ApiModelProperty(
    name = "mDatetime",
    value = "时间",
    dataType = "时间",
    notes = "5ab854687c51e0fcf5171ca1"
  )
  private java.sql.Timestamp mDatetime;
}

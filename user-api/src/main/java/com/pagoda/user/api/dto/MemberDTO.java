package com.pagoda.user.api.dto;

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
  treeStyle = false,
  auditable = false,
  traceable = false,
  approvalRequired = true,
  requestUrl = "",
  tableMultiSelect = false
)
public class MemberDTO implements Serializable {

  @FieldMeta(
    name = "id",
    nameCN = "主键id",
    type = "integer",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "id", value = "主键id", dataType = "long", notes = "")
  private Long id;

  @FieldMeta(
    name = "deleted",
    nameCN = "软删除标记",
    type = "boolean",
    visible = false,
    canQuery = false
  )
  @ApiModelProperty(name = "deleted", value = "软删除标记", dataType = "boolean", notes = "")
  private Boolean deleted;

  @FieldMeta(name = "enabled", nameCN = "是否启用", type = "boolean", visible = true, canQuery = false)
  @ApiModelProperty(name = "enabled", value = "是否启用", dataType = "boolean", notes = "")
  private Boolean enabled;

  @FieldMeta(
    name = "approvalStatus",
    nameCN = "审核状态",
    type = "integer",
    visible = true,
    canQuery = false
  )
  @ApiModelProperty(name = "approvalStatus", value = "审核状态", dataType = "integer", notes = "")
  private Integer approvalStatus;

  @FieldMeta(
    name = "approvalAt",
    nameCN = "审核时间",
    type = "datetime",
    visible = true,
    canQuery = false
  )
  @ApiModelProperty(name = "approvalAt", value = "审核时间", dataType = "datetime", notes = "")
  private Date approvalAt;

  @FieldMeta(name = "approver", nameCN = "审核人", type = "string", visible = true, canQuery = false)
  @ApiModelProperty(name = "approver", value = "审核人", dataType = "string", notes = "")
  private String approver;

  @FieldMeta(
    name = "年龄",
    scene = "s",
    nameCN = "年龄",
    nameEN = "year",
    type = "整型",
    format = "ss",
    displayLen = 11,
    formSize = "",
    constraint = "11",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = true,
    required = true,
    visible = true,
    defaultValue = "1",
    tag = "",
    sortable = true,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "left",
    sensitive = false
  )
  @ApiModelProperty(name = "年龄", value = "年龄", dataType = "整型", notes = "5abccc5e7c51e0fcf51feaca")
  private Integer 年龄;

  @FieldMeta(
    name = "日期",
    scene = "ss",
    nameCN = "日期",
    nameEN = "date",
    type = "日期",
    format = "s",
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
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false
  )
  @ApiModelProperty(name = "日期", value = "日期", dataType = "日期", notes = "5abccc2f7c51e0fcf51fea5b")
  private java.util.Date 日期;

  @FieldMeta(
    name = "name",
    scene = "ss",
    nameCN = "水果名称",
    nameEN = "fruitName",
    type = "字符串",
    format = "##",
    displayLen = 12,
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
    sortable = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false
  )
  @ApiModelProperty(
    name = "name",
    value = "水果名称",
    dataType = "字符串",
    notes = "5abccc147c51e0fcf51fea17"
  )
  private String name;

  @FieldMeta(
    name = "enumerate",
    scene = "sys",
    nameCN = "枚举测试",
    nameEN = "enumerate",
    type = "枚举",
    format = "##",
    displayLen = 1,
    formSize = "",
    constraint = "acc_dc",
    constraintParams = "{\"a\":1}",
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
    name = "enumerate",
    value = "枚举测试",
    dataType = "枚举",
    notes = "5abccb8a7c51e0fcf51fe8ea"
  )
  private String enumerate;
}

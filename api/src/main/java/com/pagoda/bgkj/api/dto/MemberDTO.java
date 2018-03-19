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
  requestUrl = "zxxx",
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
    name = "memberAge",
    scene = "sys",
    nameCN = "年龄",
    nameEN = "member age",
    type = "整型",
    format = "0",
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
    fixed = ""
  )
  @ApiModelProperty(
    name = "memberAge",
    value = "年龄",
    dataType = "整型",
    notes = "5aab86517c51e0fcf5fea739"
  )
  private Integer memberAge;

  @FieldMeta(
    name = "memberName",
    scene = "sys",
    nameCN = "成员名称",
    nameEN = "member",
    type = "字符串",
    format = "##",
    displayLen = 20,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = true,
    required = true,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = true,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = ""
  )
  @ApiModelProperty(
    name = "memberName",
    value = "成员名称",
    dataType = "字符串",
    notes = "5aab86077c51e0fcf5fea4ec"
  )
  private String memberName;

  @FieldMeta(
    name = "depName",
    scene = "bgkj",
    nameCN = "部门名称",
    nameEN = "department name",
    type = "字符串",
    format = "%",
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
    fixed = ""
  )
  @ApiModelProperty(
    name = "depName",
    value = "部门名称",
    dataType = "字符串",
    notes = "5aac8d1e7c51e0fcf5ff30eb"
  )
  private String depName;

  @FieldMeta(
    name = "memberNum",
    scene = "sys",
    nameCN = "成员数",
    nameEN = "member num",
    type = "整型",
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
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = ""
  )
  @ApiModelProperty(
    name = "memberNum",
    value = "成员数",
    dataType = "整型",
    notes = "5aacc6887c51e0fcf5ff9bd9"
  )
  private Integer memberNum;

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
    fixed = ""
  )
  @ApiModelProperty(name = "age", value = "年龄", dataType = "整型", notes = "5aacc6377c51e0fcf5ff9b43")
  private Integer age;

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
    persistent = true,
    canQuery = true,
    readOnly = true,
    required = true,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = true,
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
    name = "username",
    scene = "sys",
    nameCN = "用户名",
    nameEN = "username",
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
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "left"
  )
  @ApiModelProperty(
    name = "username",
    value = "用户名",
    dataType = "字符串",
    notes = "5aacdea57c51e0fcf5ffb972"
  )
  private String username;
}

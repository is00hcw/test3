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
@ValidateProperties(rulePrefix = "validator.User")
@Data
@ApiModel(value = "UserDTO", description = "用户")
@EntityFeature(
  entityName = "UserDTO",
  persistent = true,
  generationType = "redis",
  batchImport = true,
  treeStyle = false,
  auditable = true,
  traceable = true,
  approvalRequired = true,
  requestUrl = "",
  tableMultiSelect = false
)
public class UserDTO implements Serializable {

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
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "deleted", value = "软删除标记", dataType = "boolean", notes = "")
  private Boolean deleted;

  @FieldMeta(name = "enabled", nameCN = "是否启用", type = "boolean", visible = true, canQuery = false)
  @ApiModelProperty(name = "enabled", value = "是否启用", dataType = "boolean", notes = "")
  private Boolean enabled;

  @FieldMeta(
    name = "createdAt",
    nameCN = "创建时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "createdAt", value = "创建时间", dataType = "datetime", notes = "")
  private Date createdAt;

  @FieldMeta(
    name = "createdBy",
    nameCN = "创建人",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "createdBy", value = "创建人", dataType = "string", notes = "")
  private String createdBy;

  @FieldMeta(
    name = "creatorOrgCode",
    nameCN = "创建人所属部门",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorOrgCode", value = "创建人所属部门", dataType = "string", notes = "")
  private String creatorOrgCode;

  @FieldMeta(
    name = "lastModifiedAt",
    nameCN = "最近修改时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "lastModifiedAt", value = "", dataType = "datetime", notes = "")
  private Date lastModifiedAt;

  @FieldMeta(
    name = "lastModifiedBy",
    nameCN = "最近修改人",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "lastModifiedBy", value = "最近修改人", dataType = "string", notes = "")
  private String lastModifiedBy;

  @FieldMeta(
    name = "modifierOrgCode",
    nameCN = "修改人所属部门",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierOrgCode", value = "修改人所属部门", dataType = "string", notes = "")
  private String modifierOrgCode;

  @FieldMeta(
    name = "version",
    nameCN = "版本号",
    type = "integer",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "version", value = "版本号", dataType = "", notes = "")
  private Integer version;

  @FieldMeta(
    name = "active",
    nameCN = "是否当前版本",
    type = "boolean",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "active", value = "是否当前版本", dataType = "boolean", notes = "")
  private Boolean active;

  @FieldMeta(
    name = "approvalStatus",
    nameCN = "审核状态",
    type = "integer",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "approvalStatus", value = "审核状态", dataType = "integer", notes = "")
  private Integer approvalStatus;

  @FieldMeta(
    name = "approvalAt",
    nameCN = "审核时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "approvalAt", value = "审核时间", dataType = "datetime", notes = "")
  private Date approvalAt;

  @FieldMeta(
    name = "approver",
    nameCN = "审核人",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "approver", value = "审核人", dataType = "string", notes = "")
  private String approver;

  @FieldMeta(
    name = "name",
    scene = "User",
    nameCN = "名称",
    comment = "用户名称",
    nameEN = "name",
    type = "字符串",
    format = "{}",
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
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "name",
    value = "名称",
    dataType = "字符串",
    notes = "5ab894fa7c51e0fcf5176cee"
  )
  private String name;

  @FieldMeta(
    name = "age",
    scene = "User",
    nameCN = "年龄",
    comment = "用户年龄",
    nameEN = "age",
    type = "整型",
    format = "{}",
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
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "right",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(name = "age", value = "年龄", dataType = "整型", notes = "5ab895297c51e0fcf5176d2d")
  private Integer age;

  @FieldMeta(
    name = "weight",
    scene = "User",
    nameCN = "体重",
    comment = "用户体重",
    nameEN = "weight",
    type = "浮点数",
    format = "{}",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = true,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "right",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "weight",
    value = "体重",
    dataType = "浮点数",
    notes = "5ab895457c51e0fcf5176d59"
  )
  private Double weight;

  @FieldMeta(
    name = "sex",
    scene = "User",
    nameCN = "性别",
    comment = "用户性别",
    nameEN = "sex",
    type = "布尔",
    format = "{}",
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
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "left",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(name = "sex", value = "性别", dataType = "布尔", notes = "5ab895e47c51e0fcf5176e3a")
  private Boolean sex;

  @FieldMeta(
    name = "registerTime",
    scene = "User",
    nameCN = "注册时间",
    comment = "用户注册时间",
    nameEN = "registerTime",
    type = "时间",
    format = "{}",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = true,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "right",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "registerTime",
    value = "注册时间",
    dataType = "时间",
    notes = "5ab895ba7c51e0fcf5176dfe"
  )
  private java.sql.Timestamp registerTime;

  @FieldMeta(
    name = "registerDate",
    scene = "User",
    nameCN = "注册时期",
    comment = "用户注册日期",
    nameEN = "registerDate",
    type = "日期",
    format = "{}",
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
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "left",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "registerDate",
    value = "注册时期",
    dataType = "日期",
    notes = "5ab8959a7c51e0fcf5176dd0"
  )
  private java.util.Date registerDate;

  @FieldMeta(
    name = "height",
    scene = "User",
    nameCN = "身高",
    comment = "用户身高",
    nameEN = "height",
    type = "小数",
    format = "{}",
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
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "left",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "height",
    value = "身高",
    dataType = "小数",
    notes = "5ab896057c51e0fcf5176e68"
  )
  private java.math.BigDecimal height;

  @FieldMeta(
    name = "roleName",
    scene = "User",
    nameCN = "角色名字",
    comment = "用户角色",
    nameEN = "userRoleName",
    type = "枚举",
    format = "['default','admin']",
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
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "left",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "roleName",
    value = "角色名字",
    dataType = "枚举",
    notes = "5ab897e57c51e0fcf5177100"
  )
  private String roleName;
}

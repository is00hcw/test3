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
@ValidateProperties(rulePrefix = "validator.Role")
@Data
@ApiModel(value = "RoleDTO", description = "角色")
@EntityFeature(
  entityName = "RoleDTO",
  persistent = true,
  generationType = "redis",
  batchImport = true,
  treeStyle = false,
  auditable = true,
  traceable = true,
  approvalRequired = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class RoleDTO implements Serializable {

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
    name = "name",
    scene = "Role",
    nameCN = "名称",
    comment = "角色名称",
    nameEN = "RoleName",
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
    fixed = "right",
    sensitive = false
  )
  @ApiModelProperty(
    name = "name",
    value = "名称",
    dataType = "字符串",
    notes = "5ab8963b7c51e0fcf5176eb8"
  )
  private String name;

  @FieldMeta(
    name = "permissions",
    scene = "Role",
    nameCN = "权限",
    comment = "角色所具有的权限",
    nameEN = "permissions",
    type = "枚举",
    format = "[1,2,3,4,5]",
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
    sensitive = false
  )
  @ApiModelProperty(
    name = "permissions",
    value = "权限",
    dataType = "枚举",
    notes = "5ab896c47c51e0fcf5176f75"
  )
  private String permissions;
}

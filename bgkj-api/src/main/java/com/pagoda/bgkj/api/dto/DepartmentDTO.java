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
@ApiModel(value = "DepartmentDTO", description = "部门")
@EntityFeature(
  entityName = "DepartmentDTO",
  persistent = true,
  batchImport = true,
  treeStyle = true,
  auditable = true,
  traceable = true,
  approvalRequired = true,
  requestUrl = "",
  tableMultiSelect = true
)
public class DepartmentDTO implements Serializable {

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
    name = "parentId",
    nameCN = "父节点id",
    type = "integer",
    visible = false,
    canQuery = false
  )
  @ApiModelProperty(name = "parentId", value = "父节点id", dataType = "long", notes = "")
  private Long parentId;

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

  @FieldMeta(name = "active", nameCN = "是否当前版本", type = "boolean", visible = true, canQuery = false)
  @ApiModelProperty(name = "active", value = "是否当前版本", dataType = "boolean", notes = "")
  private Boolean active;

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
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false
  )
  @ApiModelProperty(
    name = "depName",
    value = "部门名称",
    dataType = "字符串",
    notes = "5ab620e07c51e0fcf512a92e"
  )
  private String depName;

  @FieldMeta(
    name = "depType",
    scene = "sys",
    nameCN = "部门类型",
    nameEN = "department type",
    type = "字符串",
    format = "dd",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
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
    name = "depType",
    value = "部门类型",
    dataType = "字符串",
    notes = "5ab6210b7c51e0fcf512a9a4"
  )
  private String depType;
}

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
@ApiModel(value = "UserDTO", description = "user")
@EntityFeature(
  entityName = "UserDTO",
  persistent = true,
  batchImport = true,
  treeStyle = true,
  auditable = true,
  traceable = true,
  approvalRequired = true,
  requestUrl = "",
  tableMultiSelect = true
)
public class UserDTO implements Serializable {

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

  @FieldMeta(name = "createdAt", nameCN = "创建时间", type = "datetime")
  @ApiModelProperty(name = "createdAt", value = "创建时间", dataType = "datetime", notes = "")
  private Date createdAt;

  @FieldMeta(name = "createdBy", nameCN = "创建人", type = "string")
  @ApiModelProperty(name = "createdBy", value = "创建人", dataType = "string", notes = "")
  private String createdBy;

  @FieldMeta(name = "lastModifiedAt", nameCN = "最近修改时间", type = "datetime")
  @ApiModelProperty(name = "lastModifiedAt", value = "", dataType = "datetime", notes = "")
  private Date lastModifiedAt;

  @FieldMeta(name = "lastModifiedBy", nameCN = "最近修改人", type = "string")
  @ApiModelProperty(name = "lastModifiedBy", value = "最近修改人", dataType = "string", notes = "")
  private String lastModifiedBy;

  @FieldMeta(name = "version", nameCN = "版本号", type = "integer")
  @ApiModelProperty(name = "version", value = "版本号", dataType = "", notes = "")
  private Integer version;

  @FieldMeta(name = "active", nameCN = "是否当前版本", type = "boolean")
  @ApiModelProperty(name = "active", value = "是否当前版本", dataType = "boolean", notes = "")
  private Boolean active;

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
    name = "password",
    scene = "sys",
    nameCN = "密码",
    nameEN = "user password",
    type = "字符串",
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
    enumerationType = true,
    constraintParamsExtra = "",
    fixed = ""
  )
  @ApiModelProperty(
    name = "password",
    value = "密码",
    dataType = "字符串",
    notes = "5aacded77c51e0fcf5ffb982"
  )
  private String password;

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
    name = "username",
    value = "用户名",
    dataType = "字符串",
    notes = "5aacdea57c51e0fcf5ffb972"
  )
  private String username;
}

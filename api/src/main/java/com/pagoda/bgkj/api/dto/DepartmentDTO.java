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
  auditable = false,
  traceable = false,
  approvalRequired = true,
  requestUrl = "xxx",
  tableMultiSelect = true
)
public class DepartmentDTO implements Serializable {

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
    name = "depType",
    scene = "bgkj",
    nameCN = "部门类型",
    nameEN = "department type",
    type = "整型",
    format = "$",
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
    sortable = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = ""
  )
  @ApiModelProperty(
    name = "depType",
    value = "部门类型",
    dataType = "整型",
    notes = "5aac8e177c51e0fcf5ff3123"
  )
  private Integer depType;

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
    sortable = false,
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
}

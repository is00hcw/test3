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
    name = "memberName",
    scene = "sys",
    nameCN = "成员名称",
    nameEN = "member name",
    type = "字符串",
    format = "##",
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
  @ApiModelProperty(
    name = "memberName",
    value = "成员名称",
    dataType = "字符串",
    notes = "5ab4c1cd7c51e0fcf5123c00"
  )
  private String memberName;
}

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
@ApiModel(value = "GetMemberNumDTO", description = "获取所有成员数")
@EntityFeature(
  entityName = "GetMemberNumDTO",
  persistent = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class GetMemberNumDTO implements Serializable {
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
    fixed = ""
  )
  @ApiModelProperty(
    name = "memberNum",
    value = "成员数",
    dataType = "整型",
    notes = "5aacc6887c51e0fcf5ff9bd9"
  )
  private Integer memberNum;
}

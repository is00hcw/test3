package com.pagoda.bgkj.domain;

import com.pagoda.platform.jms.annotation.*;
import com.pagoda.platform.jms.hibernate.SnowflakeGenerator;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.bgkj.api.dto.*;

import lombok.Data;
import ma.glasnost.orika.*;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.hibernate.annotations.*;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 成员实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "Member")
@SQLDelete(sql = "update Member set deleted = true where id = ?")
@Where(clause = "deleted = false")
@EntityFeature(
  entityName = "Member",
  persistent = true,
  batchImport = true,
  treeStyle = true,
  auditable = false,
  traceable = false,
  approvalRequired = true,
  requestUrl = "xxx",
  tableMultiSelect = true
)
public class Member extends MemberDTO implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @FieldMeta(
    name = "id",
    nameCN = "主键id",
    type = "long",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  private Long id;

  @FieldMeta(
    name = "deleted",
    nameCN = "软删除标记",
    type = "boolean",
    visible = false,
    canQuery = false
  )
  @Column(name = "deleted", insertable = false, columnDefinition = "boolean default 0")
  private Boolean deleted = false;

  @FieldMeta(name = "enabled", nameCN = "是否启用", type = "boolean", visible = true, canQuery = false)
  @Column(name = "enabled", insertable = false, columnDefinition = "boolean default 1")
  private Boolean enabled = true;

  @FieldMeta(name = "parentId", nameCN = "父节点id", type = "long", visible = false, canQuery = false)
  @Column(name = "parentId")
  private Long parentId;

  @FieldMeta(
    name = "approvalStatus",
    nameCN = "审核状态",
    type = "integer",
    visible = true,
    canQuery = false
  )
  @Column(name = "approvalStatus")
  private Integer approvalStatus;

  @FieldMeta(
    name = "approvalAt",
    nameCN = "审核时间",
    type = "datetime",
    visible = true,
    canQuery = false
  )
  @Column(name = "approvalAt")
  private Date approvalAt;

  @FieldMeta(name = "approver", nameCN = "审核人", type = "string", visible = true, canQuery = false)
  @Column(name = "approver")
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
    sensitive = true
  )
  @Column(name = "depName")
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
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = true
  )
  @Column(name = "memberAge", length = 20)
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
  @Column(name = "memberName")
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
  @Column(name = "enumerateMultiple")
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
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false
  )
  @Column(name = "enumerate")
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
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = true
  )
  @Column(name = "mDate")
  @Temporal(TemporalType.DATE)
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
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false
  )
  @Column(name = "mDatetime")
  private java.sql.Timestamp mDatetime;

  public Member() {}

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(Member.class, MemberDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public static Member convertDTO(MemberDTO dto) {
    return mapper.map(dto, Member.class);
  }

  public static Iterable<Member> batchConvertDTO(Iterable<MemberDTO> dtos) {
    List<Member> entities = new ArrayList<>();
    dtos.forEach(d -> entities.add(convertDTO(d)));
    return entities;
  }

  public static Iterable<MemberDTO> batchConvert(Iterable<Member> entities) {
    List<MemberDTO> dtos = new ArrayList<>();
    entities.forEach(e -> dtos.add(e));
    return dtos;
  }

  public static Converter<Member, MemberDTO> DTO_CONVERTER =
      new Converter<Member, MemberDTO>() {

        @Override
        public MemberDTO convert(Member source) {
          return source;
        }
      };
}

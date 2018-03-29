package com.pagoda.user.domain;

import com.pagoda.platform.jms.annotation.*;
import com.pagoda.platform.jms.hibernate.SnowflakeGenerator;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.user.api.dto.*;

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
  treeStyle = false,
  auditable = false,
  traceable = false,
  approvalRequired = true,
  requestUrl = "",
  tableMultiSelect = false
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
  @Column(name = "年龄", length = 11)
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
  @Column(name = "日期")
  @Temporal(TemporalType.DATE)
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
  @Column(name = "name", length = 14)
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
  @Column(name = "enumerate")
  private String enumerate;

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

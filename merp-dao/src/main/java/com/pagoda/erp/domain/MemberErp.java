package com.pagoda.erp.domain;

import com.pagoda.platform.jms.annotation.*;
import com.pagoda.platform.jms.hibernate.SnowflakeGenerator;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.erp.api.dto.*;

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
 * 会员1实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "MemberErp")
@SQLDelete(sql = "update MemberErp set deleted = true where id = ?")
@Where(clause = "deleted = false")
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
@EntityFeature(
  entityName = "MemberErp",
  persistent = true,
  batchImport = false,
  treeStyle = false,
  auditable = true,
  traceable = false,
  approvalRequired = false,
  requestUrl = "",
  tableMultiSelect = true
)
public class MemberErp extends MemberErpDTO implements Serializable {

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
    name = "createdAt",
    nameCN = "创建时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "createdAt", updatable = false)
  @CreatedDate
  private Date createdAt;

  @FieldMeta(
    name = "createdBy",
    nameCN = "创建人",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "createdBy")
  @CreatedBy
  private String createdBy;

  @FieldMeta(
    name = "creatorOrgCode",
    nameCN = "创建人所属部门",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "creatorOrgCode")
  private String creatorOrgCode;

  @FieldMeta(
    name = "lastModifiedAt",
    nameCN = "最近修改时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "lastModifiedAt")
  @LastModifiedDate
  private Date lastModifiedAt;

  @FieldMeta(
    name = "lastModifiedBy",
    nameCN = "最近修改人",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "lastModifiedBy")
  @LastModifiedBy
  private String lastModifiedBy;

  @FieldMeta(
    name = "modifierOrgCode",
    nameCN = "修改人所属部门",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "modifierOrgCode")
  private String modifierOrgCode;

  @FieldMeta(
    name = "enumerate",
    scene = "sys",
    nameCN = "枚举测试",
    nameEN = "enumerate",
    type = "枚举",
    format = "##",
    displayLen = 10,
    formSize = "",
    constraint = "acc_dc",
    constraintParams = "{\"a\": 1}",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = true,
    visible = true,
    defaultValue = "1",
    tag = "",
    sortable = true,
    enumerationType = true,
    constraintParamsExtra = "",
    fixed = "left",
    sensitive = true
  )
  @Column(name = "enumerate", length = 10)
  private String enumerate;

  public MemberErp() {}

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(MemberErp.class, MemberErpDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public static MemberErp convertDTO(MemberErpDTO dto) {
    return mapper.map(dto, MemberErp.class);
  }

  public static Iterable<MemberErp> batchConvertDTO(Iterable<MemberErpDTO> dtos) {
    List<MemberErp> entities = new ArrayList<>();
    dtos.forEach(d -> entities.add(convertDTO(d)));
    return entities;
  }

  public static Iterable<MemberErpDTO> batchConvert(Iterable<MemberErp> entities) {
    List<MemberErpDTO> dtos = new ArrayList<>();
    entities.forEach(e -> dtos.add(e));
    return dtos;
  }

  public static Converter<MemberErp, MemberErpDTO> DTO_CONVERTER =
      new Converter<MemberErp, MemberErpDTO>() {

        @Override
        public MemberErpDTO convert(MemberErp source) {
          return source;
        }
      };
}

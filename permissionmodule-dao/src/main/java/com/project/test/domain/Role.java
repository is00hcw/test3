package com.project.test.domain;

import com.pagoda.platform.jms.annotation.*;
import com.pagoda.platform.jms.hibernate.SnowflakeGenerator;
import com.pagoda.platform.jms.jpa.*;
import com.project.test.api.dto.*;

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
 * 角色实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@ValidateProperties(rulePrefix = "validator.Role")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "Role")
@org.hibernate.annotations.Table(appliesTo = "Role", comment = "角色")
@SQLDelete(sql = "update Role set deleted = true where id = ? and version = ?")
@Where(clause = "deleted = false")
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
@EntityFeature(
  entityName = "Role",
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
public class Role extends RoleDTO implements Serializable {

  @Id
  @GenericGenerator(
    name = "redis",
    strategy = "com.pagoda.platform.jms.hibernate.RedisIdentifierGenerator"
  )
  @GeneratedValue(generator = "redis")
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
    canQuery = false,
    readOnly = true
  )
  @Column(
    name = "deleted",
    insertable = false,
    columnDefinition = "boolean default 0 COMMENT '软删除标记'"
  )
  private Boolean deleted = false;

  @FieldMeta(name = "enabled", nameCN = "是否启用", type = "boolean", visible = true, canQuery = false)
  @Column(
    name = "enabled",
    insertable = false,
    columnDefinition = "boolean default 1 COMMENT '是否启用'"
  )
  private Boolean enabled = true;

  @FieldMeta(
    name = "createdAt",
    nameCN = "创建时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "createdAt", updatable = false, columnDefinition = "datetime COMMENT '创建时间'")
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
  @Column(name = "createdBy", columnDefinition = "varchar(30) COMMENT '创建人'")
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
  @Column(name = "creatorOrgCode", columnDefinition = "varchar(200) COMMENT '创建人所属部门'")
  private String creatorOrgCode;

  @FieldMeta(
    name = "lastModifiedAt",
    nameCN = "最近修改时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "lastModifiedAt", columnDefinition = "datetime COMMENT '最近修改时间'")
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
  @Column(name = "lastModifiedBy", columnDefinition = "varchar(30) COMMENT '最近修改人'")
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
  @Column(name = "modifierOrgCode", columnDefinition = "varchar(200) COMMENT '修改人所属部门'")
  private String modifierOrgCode;

  @FieldMeta(
    name = "version",
    nameCN = "版本号",
    type = "integer",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "version", columnDefinition = "int(11) COMMENT '版本号'")
  @Version
  private Integer version;

  @FieldMeta(
    name = "active",
    nameCN = "是否当前版本",
    type = "boolean",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(
    name = "active",
    insertable = false,
    columnDefinition = "boolean default 1 COMMENT '是否当前版本'"
  )
  private Boolean active = true;

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
  @Column(name = "name", columnDefinition = "varchar(255) COMMENT '角色名称'")
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
  @Column(name = "permissions", columnDefinition = "varchar(255) COMMENT '角色所具有的权限'")
  private String permissions;

  public Role() {}

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(Role.class, RoleDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public static Role convertDTO(RoleDTO dto) {
    return mapper.map(dto, Role.class);
  }

  public static Iterable<Role> batchConvertDTO(Iterable<RoleDTO> dtos) {
    List<Role> entities = new ArrayList<>();
    dtos.forEach(d -> entities.add(convertDTO(d)));
    return entities;
  }

  public static Iterable<RoleDTO> batchConvert(Iterable<Role> entities) {
    List<RoleDTO> dtos = new ArrayList<>();
    entities.forEach(e -> dtos.add(e));
    return dtos;
  }

  public static Converter<Role, RoleDTO> DTO_CONVERTER =
      new Converter<Role, RoleDTO>() {

        @Override
        public RoleDTO convert(Role source) {
          return source;
        }
      };
}

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
 * 部门实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "Department")
@SQLDelete(sql = "update Department set deleted = true where id = ? and version = ?")
@Where(clause = "deleted = false")
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
@EntityFeature(
  entityName = "Department",
  persistent = true,
  batchImport = true,
  treeStyle = true,
  auditable = true,
  traceable = true,
  approvalRequired = true,
  requestUrl = "",
  tableMultiSelect = true
)
public class Department extends DepartmentDTO implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @FieldMeta(name = "id", nameCN = "主键id", type = "long")
  private Long id;

  @FieldMeta(name = "deleted", nameCN = "软删除标记", type = "boolean")
  @Column(name = "deleted", insertable = false, columnDefinition = "boolean default 0")
  private Boolean deleted = false;

  @FieldMeta(name = "enabled", nameCN = "是否启用", type = "boolean")
  @Column(name = "enabled", insertable = false, columnDefinition = "boolean default 1")
  private Boolean enabled = true;

  @FieldMeta(name = "parentId", nameCN = "父节点id", type = "long")
  @Column(name = "parentId")
  private Long parentId;

  @FieldMeta(name = "createdAt", nameCN = "创建时间", type = "datetime")
  @Column(name = "createdAt", updatable = false)
  @CreatedDate
  private Date createdAt;

  @FieldMeta(name = "createdBy", nameCN = "创建人", type = "string")
  @Column(name = "createdBy")
  @CreatedBy
  private String createdBy;

  @FieldMeta(name = "creatorOrgCode", nameCN = "创建人所属部门", type = "string")
  @Column(name = "creatorOrgCode")
  private String creatorOrgCode;

  @FieldMeta(name = "lastModifiedAt", nameCN = "最近修改时间", type = "datetime")
  @Column(name = "lastModifiedAt")
  @LastModifiedDate
  private Date lastModifiedAt;

  @FieldMeta(name = "lastModifiedBy", nameCN = "最近修改人", type = "string")
  @Column(name = "lastModifiedBy")
  @LastModifiedBy
  private String lastModifiedBy;

  @FieldMeta(name = "modifierOrgCode", nameCN = "修改人所属部门", type = "string")
  @Column(name = "modifierOrgCode")
  private String modifierOrgCode;

  @FieldMeta(name = "version", nameCN = "版本号", type = "integer")
  @Column(name = "version")
  @Version
  private Integer version;

  @FieldMeta(name = "active", nameCN = "是否当前版本", type = "boolean")
  @Column(name = "active", insertable = false, columnDefinition = "boolean default 1")
  private Boolean active = true;

  @FieldMeta(name = "approvalStatus", nameCN = "审核状态", type = "integer")
  @Column(name = "approvalStatus")
  private Integer approvalStatus;

  @FieldMeta(name = "approvalAt", nameCN = "审核时间", type = "datetime")
  @Column(name = "approvalAt")
  private Date approvalAt;

  @FieldMeta(name = "approver", nameCN = "审核人", type = "string")
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
    sensitive = false
  )
  @Column(name = "depName")
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
  @Column(name = "depType")
  private String depType;

  public Department() {}

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(Department.class, DepartmentDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public static Department convertDTO(DepartmentDTO dto) {
    return mapper.map(dto, Department.class);
  }

  public static Iterable<Department> batchConvertDTO(Iterable<DepartmentDTO> dtos) {
    List<Department> entities = new ArrayList<>();
    dtos.forEach(d -> entities.add(convertDTO(d)));
    return entities;
  }

  public static Iterable<DepartmentDTO> batchConvert(Iterable<Department> entities) {
    List<DepartmentDTO> dtos = new ArrayList<>();
    entities.forEach(e -> dtos.add(e));
    return dtos;
  }

  public static Converter<Department, DepartmentDTO> DTO_CONVERTER =
      new Converter<Department, DepartmentDTO>() {

        @Override
        public DepartmentDTO convert(Department source) {
          return source;
        }
      };
}

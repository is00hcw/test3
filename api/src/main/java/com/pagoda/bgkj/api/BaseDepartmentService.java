package com.pagoda.bgkj.api;

import com.pagoda.bgkj.api.dto.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.data.domain.*;

/**
 * Service继承的父接口,定义一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BaseDepartmentService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  DepartmentDTO create(@ApiParam(value = "entity", required = true) DepartmentDTO entity)
      throws ServiceException;

  /**
   * Create all given entities.
   *
   * @param entities
   * @return the saved entities
   * @throws IllegalArgumentException in case the given entity is {@literal null}.
   * @throws ServiceException
   */
  @ApiOperation(value = "batchCreate", notes = "批量插入多条记录")
  Iterable<DepartmentDTO> batchCreate(
      @ApiParam(value = "entities", required = true) Iterable<DepartmentDTO> entities)
      throws ServiceException;

  /**
   * Update a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "update", notes = "更新一条记录")
  DepartmentDTO update(@ApiParam(value = "entity", required = true) DepartmentDTO entity)
      throws ServiceException;

  /**
   * Update all given entities.
   *
   * @param entities
   * @return the saved entities
   * @throws IllegalArgumentException in case the given entity is {@literal null}.
   * @throws ServiceException
   */
  @ApiOperation(value = "batchUpdate", notes = "批量更新多条记录")
  Iterable<DepartmentDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<DepartmentDTO> entities)
      throws ServiceException;

  /**
   * Deletes the entity with the given id.
   *
   * @param id must not be {@literal null}.
   * @throws IllegalArgumentException in case the given {@code id} is {@literal null}
   * @throws ServiceException
   */
  @ApiOperation(value = "delete", notes = "删除一条记录")
  void delete(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * Deletes the entities in a batch with the given ids.
   *
   * @param ids must not be {@literal null}.
   * @throws IllegalArgumentException in case the given {@code ids} is {@literal null}
   * @throws ServiceException
   */
  @ApiOperation(value = "batchDelete", notes = "批量删除多条记录")
  void batchDelete(@ApiParam(value = "ids", required = true) Iterable<Long> ids)
      throws ServiceException;

  /**
   * Retrieves an entity by its id.
   *
   * @param id must not be {@literal null}.
   * @return the entity with the given id or {@literal null} if none found
   * @throws IllegalArgumentException if {@code id} is {@literal null}
   * @throws ServiceException
   */
  @ApiOperation(value = "getById", notes = "根据id查询记录")
  DepartmentDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * 取得id之下的子树，以一个树形结构返回。
   *
   * @param id
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "getTree", notes = "取得id之下的子树，以一个树形结构返回")
  Iterable<DepartmentDTO> getTree(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param depType
   * @param depName
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<DepartmentDTO> findBy(
      @ApiParam("depType") Integer depType,
      @ApiParam("depName") String depName,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}

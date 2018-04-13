package com.project.test.api;

import com.project.test.api.dto.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.data.domain.*;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Service继承的父接口,定义一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public interface BaseUserService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  UserDTO create(@ApiParam(value = "entity", required = true) @Valid UserDTO entity)
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
  Iterable<UserDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<UserDTO> entities)
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
  UserDTO update(@ApiParam(value = "entity", required = true) UserDTO entity)
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
  Iterable<UserDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<UserDTO> entities)
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
  UserDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param name
   * @param age
   * @param weight
   * @param sex
   * @param registerTime
   * @param registerDate
   * @param height
   * @param roleName
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<UserDTO> findBy(
      @ApiParam("name") String name,
      @ApiParam("age") Integer age,
      @ApiParam("weight") Double weight,
      @ApiParam("sex") Boolean sex,
      @ApiParam("registerTime") java.sql.Timestamp registerTime,
      @ApiParam("registerDate") java.util.Date registerDate,
      @ApiParam("height") java.math.BigDecimal height,
      @ApiParam("roleName") String roleName,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 查询用户的角色信息
   *
   * @param name
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findRoleName", notes = "")
  Page<UserDTO> findRoleName(@ApiParam("name") String name, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 根据用户名和角色名查找信息
   *
   * @param name1
   * @param name2
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findSomethingByRole", notes = "")
  Page<FindSomethingByRoleDTO> findSomethingByRole(
      @ApiParam("name1") String name1,
      @ApiParam("name2") String name2,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}

package com.project.test.service.base;

import com.pagoda.platform.jms.jpa.*;
import com.project.test.api.*;
import com.project.test.api.dto.*;
import com.project.test.domain.*;
import com.project.test.repo.*;

import io.swagger.annotations.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.transaction.annotation.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * 用户服务实现类UserServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseUserServiceImpl implements UserService {

  @Autowired protected UserRepository repository;

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  @Override
  public UserDTO create(@ApiParam(value = "entity", required = true) @Valid UserDTO entity)
      throws ServiceException {
    try {
      return repository.create(User.convertDTO(entity));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Create all given entities.
   *
   * @param entities
   * @return the saved entities
   * @throws IllegalArgumentException in case the given entity is {@literal null}.
   */
  @ApiOperation(value = "batchCreate", notes = "批量插入多条记录")
  @Override
  public Iterable<UserDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<UserDTO> entities)
      throws ServiceException {
    try {
      Iterable<User> itor = repository.batchCreate(User.batchConvertDTO(entities));
      return User.batchConvert(itor);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Update a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   */
  @ApiOperation(value = "update", notes = "更新一条记录")
  @Override
  public UserDTO update(@ApiParam(value = "entity", required = true) UserDTO entity)
      throws ServiceException {
    try {
      return repository.update(User.convertDTO(entity));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Update all given entities.
   *
   * @param entities
   * @return the saved entities
   * @throws IllegalArgumentException in case the given entity is {@literal null}.
   */
  @ApiOperation(value = "batchUpdate", notes = "批量更新多条记录")
  @Override
  public Iterable<UserDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<UserDTO> entities)
      throws ServiceException {
    try {
      Iterable<User> itor = repository.batchUpdate(User.batchConvertDTO(entities));
      return User.batchConvert(itor);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Deletes the entity with the given id.
   *
   * @param id must not be {@literal null}.
   * @throws IllegalArgumentException in case the given {@code id} is {@literal null}
   */
  @ApiOperation(value = "delete", notes = "删除一条记录")
  @Override
  public void delete(@ApiParam(value = "id", required = true) Long id) throws ServiceException {
    try {
      repository.delete(id);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Deletes the entities in a batch with the given ids.
   *
   * @param ids must not be {@literal null}.
   * @throws IllegalArgumentException in case the given {@code ids} is {@literal null}
   * @throws ServiceException
   */
  @ApiOperation(value = "batchDelete", notes = "批量删除多条记录")
  @Override
  public void batchDelete(@ApiParam(value = "ids", required = true) Iterable<Long> ids)
      throws ServiceException {
    for (Long id : ids) {
      delete(id);
    }
  }

  /**
   * Retrieves an entity by its id.
   *
   * @param id must not be {@literal null}.
   * @return the entity with the given id or {@literal null} if none found
   * @throws IllegalArgumentException if {@code id} is {@literal null}
   */
  @ApiOperation(value = "getById", notes = "根据id查询记录")
  @Override
  public UserDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException {
    try {
      return repository.getById(id);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<UserDTO> findBy(
      @ApiParam("name") String name,
      @ApiParam("age") Integer age,
      @ApiParam("weight") Double weight,
      @ApiParam("sex") Boolean sex,
      @ApiParam("registerTime") java.sql.Timestamp registerTime,
      @ApiParam("registerDate") java.util.Date registerDate,
      @ApiParam("height") java.math.BigDecimal height,
      @ApiParam("roleName") String roleName,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          name, age, weight, sex, registerTime, registerDate, height, roleName, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findRoleName", notes = "查询用户的角色信息")
  @Override
  public Page<UserDTO> findRoleName(
      @ApiParam("name") String name, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findRoleName(name, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findSomethingByRole", notes = "根据用户名和角色名查找信息")
  @Override
  public Page<FindSomethingByRoleDTO> findSomethingByRole(
      @ApiParam("name1") String name1,
      @ApiParam("name2") String name2,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findSomethingByRole(name1, name2, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }
}

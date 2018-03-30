package com.pagoda.erp.service.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.erp.api.*;
import com.pagoda.erp.api.dto.*;
import com.pagoda.erp.domain.*;
import com.pagoda.erp.repo.*;

import io.swagger.annotations.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.transaction.annotation.*;

/**
 * 会员1服务实现类MemberErpServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
public abstract class BaseMemberErpServiceImpl implements MemberErpService {

  @Autowired protected MemberErpRepository repository;

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  @Override
  public MemberErpDTO create(@ApiParam(value = "entity", required = true) MemberErpDTO entity)
      throws ServiceException {
    try {
      return repository.create(MemberErp.convertDTO(entity));
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
  public Iterable<MemberErpDTO> batchCreate(
      @ApiParam(value = "entities", required = true) Iterable<MemberErpDTO> entities)
      throws ServiceException {
    try {
      Iterable<MemberErp> itor = repository.batchCreate(MemberErp.batchConvertDTO(entities));
      return MemberErp.batchConvert(itor);
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
  public MemberErpDTO update(@ApiParam(value = "entity", required = true) MemberErpDTO entity)
      throws ServiceException {
    try {
      return repository.update(MemberErp.convertDTO(entity));
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
  public Iterable<MemberErpDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<MemberErpDTO> entities)
      throws ServiceException {
    try {
      Iterable<MemberErp> itor = repository.batchUpdate(MemberErp.batchConvertDTO(entities));
      return MemberErp.batchConvert(itor);
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
  public MemberErpDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException {
    try {
      return repository.getById(id);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<MemberErpDTO> findBy(
      @ApiParam("enumerate") String enumerate, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(enumerate, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }
}

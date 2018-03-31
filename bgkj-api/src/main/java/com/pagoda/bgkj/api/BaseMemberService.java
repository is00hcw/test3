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
public interface BaseMemberService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  MemberDTO create(@ApiParam(value = "entity", required = true) MemberDTO entity)
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
  Iterable<MemberDTO> batchCreate(
      @ApiParam(value = "entities", required = true) Iterable<MemberDTO> entities)
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
  MemberDTO update(@ApiParam(value = "entity", required = true) MemberDTO entity)
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
  Iterable<MemberDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<MemberDTO> entities)
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
  MemberDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * 取得id之下的子树，以一个树形结构返回。
   *
   * @param id
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "getTree", notes = "取得id之下的子树，以一个树形结构返回")
  Iterable<MemberDTO> getTree(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param depName
   * @param memberAge
   * @param memberName
   * @param enumerateMultiple
   * @param enumerate
   * @param mDate
   * @param mDatetime
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<MemberDTO> findBy(
      @ApiParam("depName") String depName,
      @ApiParam("memberAge") Integer memberAge,
      @ApiParam("memberName") String memberName,
      @ApiParam("enumerateMultiple") String enumerateMultiple,
      @ApiParam("enumerate") String enumerate,
      @ApiParam("mDate") java.util.Date mDate,
      @ApiParam("mDatetime") java.sql.Timestamp mDatetime,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 根据名称查询
   *
   * @param memberName
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findByName", notes = "")
  Page<MemberDTO> findByName(
      @ApiParam("memberName") String memberName, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 根据id删除
   *
   * @param id
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "deleteById", notes = "")
  Integer deleteById(@ApiParam("id") String id) throws ServiceException;

  /**
   * 修改Member
   *
   * @param memberName
   * @param memberAge
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "updateMember", notes = "")
  Integer updateMember(
      @ApiParam("memberName") String memberName, @ApiParam("memberAge") Integer memberAge)
      throws ServiceException;

  /**
   * 添加member
   *
   * @param memberName
   * @param memberAge
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "addMember", notes = "")
  Integer addMember(
      @ApiParam("memberName") String memberName, @ApiParam("memberAge") Integer memberAge)
      throws ServiceException;

  /**
   * 查询所有
   *
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findAllMembers", notes = "")
  Page<MemberDTO> findAllMembers(@ApiParam("pageable") Pageable pageable) throws ServiceException;

  /**
   * 多表查询取别名
   *
   * @param memberName
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findMemberInDep", notes = "")
  Page<FindMemberInDepDTO> findMemberInDep(
      @ApiParam("memberName") String memberName, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findMemberOrderBy", notes = "")
  Page<MemberDTO> findMemberOrderBy(@ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}

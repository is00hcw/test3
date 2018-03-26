package com.pagoda.bgkj.service.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.bgkj.api.*;
import com.pagoda.bgkj.api.dto.*;
import com.pagoda.bgkj.domain.*;
import com.pagoda.bgkj.repo.*;

import io.swagger.annotations.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.transaction.annotation.*;

/**
 * 成员服务实现类MemberServiceImpl继承的父类,实现一些平台共用的方法
 * @author PagodaGenerator
 * @generated
 */
public abstract class BaseMemberServiceImpl implements MemberService {

    @Autowired
    protected  MemberRepository repository;

    /**
     * Create a given entity. Use the returned instance for further operations as the save operation might have changed the
     * entity instance completely.
     *
     * @param entity
     * @return the saved entity
     */
    @ApiOperation(value = "create", notes = "新增一条记录")
    @Override
    public MemberDTO create(@ApiParam(value = "entity", required = true) MemberDTO entity) throws ServiceException {
        try {
            return repository.create(Member.convertDTO(entity));
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
    public Iterable<MemberDTO> batchCreate(@ApiParam(value = "entities", required = true) Iterable<MemberDTO> entities) throws ServiceException {
        try {
            Iterable<Member> itor = repository.batchCreate(Member.batchConvertDTO(entities));
            return Member.batchConvert(itor);
        } catch (Exception e) {
            throw new ServiceException(e);
        }
    }


    /**
     * Update a given entity. Use the returned instance for further operations as the save operation might have changed the
     * entity instance completely.
     *
     * @param entity
     * @return the saved entity
     */
    @ApiOperation(value = "update", notes = "更新一条记录")
    @Override
    public MemberDTO update(@ApiParam(value = "entity", required = true) MemberDTO entity) throws ServiceException {
        try {
            return repository.update(Member.convertDTO(entity));
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
    public Iterable<MemberDTO> batchUpdate(@ApiParam(value = "entities", required = true) Iterable<MemberDTO> entities) throws ServiceException {
        try {
            Iterable<Member> itor = repository.batchUpdate(Member.batchConvertDTO(entities));
            return Member.batchConvert(itor);
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
    public void batchDelete(@ApiParam(value = "ids", required = true) Iterable<Long> ids) throws ServiceException {
        for(Long id : ids) {
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
    public MemberDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException {
        try {
            return repository.getById(id);
        } catch (Exception e) {
            throw new ServiceException(e);
        }
    }

    /**
     * 取得id之下的子树，以一个树形结构返回。
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "getTree", notes = "取得id之下的子树，以一个树形结构返回")
    @Override
    public Iterable<MemberDTO> getTree(@ApiParam(value = "id", required = true) Long id) throws ServiceException {
        try {    
            return Member.batchConvert(repository.getTree(id));  
        } catch (Exception e) {
            throw new ServiceException(e);
        }
    }

    @ApiOperation(value = "findBy", notes = "根据非空字段查询")
    @Override
    public Page<MemberDTO> findBy(@ApiParam("memberName")String memberName, @ApiParam("memberAge")Integer memberAge, @ApiParam("depName")String depName, @ApiParam("pageable") Pageable pageable) throws ServiceException {
        try {
            return repository.findBy(memberName,memberAge,depName, pageable);
        } catch (Exception e) {
            throw new ServiceException(e);
        }
    }
    

    @ApiOperation(value = "findByName", notes = "根据名称查询")
    @Override
    public Page<MemberDTO> findByName(@ApiParam("memberName") String memberName, @ApiParam("pageable") Pageable pageable) throws ServiceException {
        try {
            return repository.findByName(memberName, pageable);
        } catch (Exception e) {
            throw new ServiceException(e);
        }

    }

    @ApiOperation(value = "deleteById", notes = "根据id删除")
    @Override
    @Transactional(rollbackFor = ServiceException.class)
    public Integer deleteById(@ApiParam("id") String id) {
        try {
            return repository.deleteById(id);
        } catch (Exception e) {
            throw new ServiceException(e);
        }

    }

    @ApiOperation(value = "updateMember", notes = "修改Member")
    @Override
    @Transactional(rollbackFor = ServiceException.class)
    public Integer updateMember(@ApiParam("memberName") String memberName, @ApiParam("memberAge") Integer memberAge) {
        try {
            return repository.updateMember(memberName,memberAge);
        } catch (Exception e) {
            throw new ServiceException(e);
        }

    }

    @ApiOperation(value = "addMember", notes = "添加member")
    @Override
    @Transactional(rollbackFor = ServiceException.class)
    public Integer addMember(@ApiParam("memberName") String memberName, @ApiParam("memberAge") Integer memberAge) {
        try {
            return repository.addMember(memberName,memberAge);
        } catch (Exception e) {
            throw new ServiceException(e);
        }

    }

    @ApiOperation(value = "findAllMembers", notes = "查询所有")
    @Override
    public Page<MemberDTO> findAllMembers(@ApiParam("memberName") String memberName, @ApiParam("pageable") Pageable pageable) throws ServiceException {
        try {
            return repository.findAllMembers(memberName, pageable);
        } catch (Exception e) {
            throw new ServiceException(e);
        }

    }

    @ApiOperation(value = "findMemberInDep", notes = "多表查询取别名")
    @Override
    public Page<FindMemberInDepDTO> findMemberInDep(@ApiParam("memberName") String memberName, @ApiParam("pageable") Pageable pageable) throws ServiceException {
        try {
            return repository.findMemberInDep(memberName, pageable);
        } catch (Exception e) {
            throw new ServiceException(e);
        }

    }

    @ApiOperation(value = "findDep", notes = "")
    @Override
    public Page<> findDep(, @ApiParam("pageable") Pageable pageable) throws ServiceException {
        try {
            return repository.findDep(, pageable);
        } catch (Exception e) {
            throw new ServiceException(e);
        }

    }


}
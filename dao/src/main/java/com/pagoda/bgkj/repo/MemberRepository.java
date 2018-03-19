package com.pagoda.bgkj.repo;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.bgkj.api.dto.*;
import com.pagoda.bgkj.domain.*;
import com.pagoda.bgkj.repo.custom.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * MemberJPA数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface MemberRepository
    extends MemberRepositoryCustom, PagodaJpaRepository<Member, Long> {

  /**
   * 根据memberName 查询member
   *
   * @param memberName
   * @param pageable
   * @return
   */
  @SqlTemplate(name = "fineMemberName", sql = "select * from Member where memberName=:memberName")
  Page<MemberDTO> fineMemberName(
      @Param("memberName") String memberName, @Param("pageable") Pageable pageable);

  /**
   * 修改member
   *
   * @param memberName
   * @param memberAge
   * @return
   */
  @SqlTemplate(
    name = "updateMemeberName",
    sql = "update Member set memberName=:memberName,memberAge=:memberAge where memberAge=:memberAge"
  )
  @Modifying
  Integer updateMemeberName(
      @Param("memberName") String memberName, @Param("memberAge") Integer memberAge);

  /**
   * 根据名称删除
   *
   * @param memberName
   * @return
   */
  @SqlTemplate(name = "deleteByName", sql = "delete from Member where memberName=:memberName")
  @Modifying
  Integer deleteByName(@Param("memberName") String memberName);

  /**
   * 新增一条数据
   *
   * @param memberName
   * @param memberAge
   * @return
   */
  @SqlTemplate(
    name = "insertOne",
    sql = "insert into Member(memberName,memberAge) values(:memberName,:memberAge)"
  )
  @Modifying
  Integer insertOne(@Param("memberName") String memberName, @Param("memberAge") Integer memberAge);

  /**
   * 获取所有成员数
   *
   * @param memberName
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "getMemberNum",
    sql = "select count(*) as memberNum from Member where memberName=:memberName"
  )
  Page<GetMemberNumDTO> getMemberNum(
      @Param("memberName") String memberName, @Param("pageable") Pageable pageable);

  /**
   * 用别名的情况，获取所有member
   *
   * @param memberName
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findAllmembers",
    sql = "select memberName as name,memberAge as age from Member where memberName=:memberName"
  )
  Page<FindAllmembersDTO> findAllmembers(
      @Param("memberName") String memberName, @Param("pageable") Pageable pageable);

  /**
   * 查询两个表
   *
   * @param memberName
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findMemberByDepName",
    sql =
        "select depType as departmentType,memberName as name,memberAge as age from Department d,Member m where d.depName=m.depName and m.memberName=:memberName"
  )
  Page<FindMemberByDepNameDTO> findMemberByDepName(
      @Param("memberName") String memberName, @Param("pageable") Pageable pageable);
}

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
 * @author PagodaGenerator
 * @generated
 */
public interface MemberRepository extends MemberRepositoryCustom, PagodaJpaRepository<Member,Long>  {

    /**
     * 根据名称查询
     * @param memberName
     * @param pageable
     * @return
     */
    @SqlTemplate(name="findByName" , sql="select * from Member where memberName=:memberName")
    Page<MemberDTO> findByName(@Param("memberName") String memberName,  @Param("pageable") Pageable pageable);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @SqlTemplate(name="deleteById" , sql="delete from Member where id=:id")
    @Modifying
    Integer deleteById(@Param("id") String id);

    /**
     * 修改Member
     * @param memberName
     * @param memberAge
     * @return
     */
    @SqlTemplate(name="updateMember" , sql="update Member set memberName=:memberName where memberAge=:memberAge")
    @Modifying
    Integer updateMember(@Param("memberName") String memberName, @Param("memberAge") Integer memberAge);

    /**
     * 添加member
     * @param memberName
     * @param memberAge
     * @return
     */
    @SqlTemplate(name="addMember" , sql="insert into Member(memberName,memberAge) values(:memberName,:memberAge)")
    @Modifying
    Integer addMember(@Param("memberName") String memberName, @Param("memberAge") Integer memberAge);

    /**
     * 查询所有
     * @param pageable
     * @return
     */
    @SqlTemplate(name="findAllMembers" , sql="select * from Member")
    Page<MemberDTO> findAllMembers( @Param("pageable") Pageable pageable);

    /**
     * 多表查询取别名
     * @param pageable
     * @return
     */
    @SqlTemplate(name="findMemberInDep" , sql="SELECT	memberName AS NAME, memberAge AS age , depType AS dType FROM Member m,Department d WHERE m.depName=d.depName")
    Page<FindMemberInDepDTO> findMemberInDep( @Param("pageable") Pageable pageable);

    /**
     * 
     * @param pageable
     * @return
     */
    @SqlTemplate(name="findDep" , sql="select * from Department")
    Page<> findDep( @Param("pageable") Pageable pageable);

}
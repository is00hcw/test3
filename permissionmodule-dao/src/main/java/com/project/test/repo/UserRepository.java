package com.project.test.repo;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.project.test.api.dto.*;
import com.project.test.domain.*;
import com.project.test.repo.custom.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * UserJPA数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface UserRepository extends UserRepositoryCustom, PagodaJpaRepository<User, Long> {

  /**
   * 查询用户的角色信息
   *
   * @param name
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findRoleName",
    sql = "select name,age,roleName from User where {{#name}}name= :name{{/name}}"
  )
  Page<UserDTO> findRoleName(@Param("name") String name, @Param("pageable") Pageable pageable);

  /**
   * 根据用户名和角色名查找信息
   *
   * @param name1
   * @param name2
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findSomethingByRole",
    sql =
        "select u.weight,u.sex,u.height,u.name name1,r.name name2 from User u,Role r where {{#name1}}u.name= :name1{{/name1}} and {{#name2}}r.name= :name2{{/name2}}"
  )
  Page<FindSomethingByRoleDTO> findSomethingByRole(
      @Param("name1") String name1,
      @Param("name2") String name2,
      @Param("pageable") Pageable pageable);
}

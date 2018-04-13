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
 * RoleJPA数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface RoleRepository extends RoleRepositoryCustom, PagodaJpaRepository<Role, Long> {

  /**
   * 查询角色所具备的权限
   *
   * @param name
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findPermissions",
    sql = "select permissions from Role where {{#name}}name=:name{{/name}}"
  )
  Page<RoleDTO> findPermissions(@Param("name") String name, @Param("pageable") Pageable pageable);
}

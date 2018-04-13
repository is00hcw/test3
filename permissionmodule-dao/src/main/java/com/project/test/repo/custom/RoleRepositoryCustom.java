package com.project.test.repo.custom;

import com.project.test.api.dto.*;
import com.pagoda.platform.jms.jpa.*;
import com.project.test.domain.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * Role扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface RoleRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param name
   * @param permissions
   * @param pageable
   * @return
   */
  Page<RoleDTO> findBy(
      @Param("name") String name,
      @Param("permissions") String permissions,
      @Param("pageable") Pageable pageable);
}

package com.project.test.repo.custom;

import com.project.test.api.dto.*;
import com.pagoda.platform.jms.jpa.*;
import com.project.test.domain.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * Permission扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface PermissionRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param name
   * @param function
   * @param pageable
   * @return
   */
  Page<PermissionDTO> findBy(
      @Param("name") String name,
      @Param("function") String function,
      @Param("pageable") Pageable pageable);
}

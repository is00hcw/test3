package com.pagoda.bgkj.repo.custom;

import com.pagoda.bgkj.api.dto.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.bgkj.domain.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * Department扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface DepartmentRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param depType
   * @param depName
   * @param pageable
   * @return
   */
  Page<DepartmentDTO> findBy(
      @Param("depType") Integer depType,
      @Param("depName") String depName,
      @Param("pageable") Pageable pageable);
}

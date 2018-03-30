package com.pagoda.erp.repo.custom;

import com.pagoda.erp.api.dto.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.erp.domain.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * MemberErp扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface MemberErpRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param enumerate
   * @param pageable
   * @return
   */
  Page<MemberErpDTO> findBy(
      @Param("enumerate") String enumerate, @Param("pageable") Pageable pageable);
}

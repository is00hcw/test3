package com.pagoda.bgkj.repo.custom;

import com.pagoda.bgkj.api.dto.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.bgkj.domain.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * Member扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface MemberRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param memberName
   * @param memberAge
   * @param depName
   * @param pageable
   * @return
   */
  Page<MemberDTO> findBy(
      @Param("memberName") String memberName,
      @Param("memberAge") Integer memberAge,
      @Param("depName") String depName,
      @Param("pageable") Pageable pageable);
}

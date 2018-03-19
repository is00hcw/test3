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
   * @param memberAge
   * @param memberName
   * @param depName
   * @param memberNum
   * @param age
   * @param name
   * @param pageable
   * @return
   */
  Page<MemberDTO> findBy(
      @Param("memberAge") Integer memberAge,
      @Param("memberName") String memberName,
      @Param("depName") String depName,
      @Param("memberNum") Integer memberNum,
      @Param("age") Integer age,
      @Param("name") String name,
      @Param("pageable") Pageable pageable);
}

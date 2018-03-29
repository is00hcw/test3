package com.pagoda.user.repo.custom;

import com.pagoda.user.api.dto.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.user.domain.*;

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
   * @param 年龄
   * @param 日期
   * @param name
   * @param enumerate
   * @param pageable
   * @return
   */
  Page<MemberDTO> findBy(
      @Param("年龄") Integer 年龄,
      @Param("日期") java.util.Date 日期,
      @Param("name") String name,
      @Param("enumerate") String enumerate,
      @Param("pageable") Pageable pageable);
}

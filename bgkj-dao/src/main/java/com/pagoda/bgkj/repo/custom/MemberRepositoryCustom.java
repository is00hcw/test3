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
   * @param depName
   * @param memberAge
   * @param memberName
   * @param enumerateMultiple
   * @param enumerate
   * @param mDate
   * @param mDatetime
   * @param pageable
   * @return
   */
  Page<MemberDTO> findBy(
      @Param("depName") String depName,
      @Param("memberAge") Integer memberAge,
      @Param("memberName") String memberName,
      @Param("enumerateMultiple") String enumerateMultiple,
      @Param("enumerate") String enumerate,
      @Param("mDate") java.util.Date mDate,
      @Param("mDatetime") java.sql.Timestamp mDatetime,
      @Param("pageable") Pageable pageable);
}

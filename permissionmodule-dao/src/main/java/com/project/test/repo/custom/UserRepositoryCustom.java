package com.project.test.repo.custom;

import com.project.test.api.dto.*;
import com.pagoda.platform.jms.jpa.*;
import com.project.test.domain.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * User扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface UserRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param name
   * @param age
   * @param weight
   * @param sex
   * @param registerTime
   * @param registerDate
   * @param height
   * @param roleName
   * @param pageable
   * @return
   */
  Page<UserDTO> findBy(
      @Param("name") String name,
      @Param("age") Integer age,
      @Param("weight") Double weight,
      @Param("sex") Boolean sex,
      @Param("registerTime") java.sql.Timestamp registerTime,
      @Param("registerDate") java.util.Date registerDate,
      @Param("height") java.math.BigDecimal height,
      @Param("roleName") String roleName,
      @Param("pageable") Pageable pageable);
}

package com.pagoda.bgkj.repo.custom;

import com.pagoda.bgkj.api.dto.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.bgkj.domain.*;

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
   * @param password
   * @param username
   * @param pageable
   * @return
   */
  Page<UserDTO> findBy(
      @Param("password") String password,
      @Param("username") String username,
      @Param("pageable") Pageable pageable);
}

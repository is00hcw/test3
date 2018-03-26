package com.pagoda.bgkj.repo;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.bgkj.api.dto.*;
import com.pagoda.bgkj.domain.*;
import com.pagoda.bgkj.repo.custom.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * DepartmentJPA数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface DepartmentRepository
    extends DepartmentRepositoryCustom, PagodaJpaRepository<Department, Long> {}

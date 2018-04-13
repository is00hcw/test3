package com.project.test.repo;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.project.test.api.dto.*;
import com.project.test.domain.*;
import com.project.test.repo.custom.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * PermissionJPA数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface PermissionRepository
    extends PermissionRepositoryCustom, PagodaJpaRepository<Permission, Long> {}

package com.pagoda.erp.repo;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.erp.api.dto.*;
import com.pagoda.erp.domain.*;
import com.pagoda.erp.repo.custom.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * MemberErpJPA数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface MemberErpRepository
    extends MemberErpRepositoryCustom, PagodaJpaRepository<MemberErp, Long> {}

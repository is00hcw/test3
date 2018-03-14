package com.pagoda.repo;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.*;
import com.pagoda.domain.*;
import com.pagoda.repo.custom.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * CookJPA数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface CookRepository extends CookRepositoryCustom, PagodaJpaRepository<Cook, Long> {}

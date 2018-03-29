package com.pagoda.user.repo;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.user.api.dto.*;
import com.pagoda.user.domain.*;
import com.pagoda.user.repo.custom.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * MemberJPA数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface MemberRepository
    extends MemberRepositoryCustom, PagodaJpaRepository<Member, Long> {}

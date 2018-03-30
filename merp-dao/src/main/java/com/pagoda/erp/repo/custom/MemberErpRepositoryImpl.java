package com.pagoda.erp.repo.custom;

import com.pagoda.erp.api.dto.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.erp.domain.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * MemberErp扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class MemberErpRepositoryImpl extends BaseRepositoryCustomImpl<MemberErp, Long>
    implements MemberErpRepositoryCustom {

  @Override
  protected Class<MemberErp> getDomainClass() {
    return MemberErp.class;
  }

  @Override
  public Page<MemberErpDTO> findBy(
      @Param("enumerate") String enumerate, @Param("pageable") Pageable pageable) {
    MemberErp obj = new MemberErp();
    obj.setEnumerate(enumerate);
    Example<MemberErp> example = Example.of(obj);

    return findAll(example, pageable).map(MemberErp.DTO_CONVERTER);
  }
}

package com.pagoda.repo.custom;

import com.pagoda.api.dto.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.domain.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Cook扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class CookRepositoryImpl extends BaseRepositoryCustomImpl<Cook, Long>
    implements CookRepositoryCustom {

  @Override
  protected Class<Cook> getDomainClass() {
    return Cook.class;
  }
}

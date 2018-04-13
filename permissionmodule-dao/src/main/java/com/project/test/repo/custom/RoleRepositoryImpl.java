package com.project.test.repo.custom;

import com.project.test.api.dto.*;
import com.pagoda.platform.jms.jpa.*;
import com.project.test.domain.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Role扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class RoleRepositoryImpl extends BaseRepositoryCustomImpl<Role, Long>
    implements RoleRepositoryCustom {

  @Override
  protected Class<Role> getDomainClass() {
    return Role.class;
  }

  @Override
  public Page<RoleDTO> findBy(
      @Param("name") String name,
      @Param("permissions") String permissions,
      @Param("pageable") Pageable pageable) {
    Role obj = new Role();
    obj.setName(name);
    obj.setPermissions(permissions);
    Example<Role> example = Example.of(obj);

    return findAll(example, pageable).map(Role.DTO_CONVERTER);
  }
}

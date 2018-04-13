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
 * Permission扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class PermissionRepositoryImpl extends BaseRepositoryCustomImpl<Permission, Long>
    implements PermissionRepositoryCustom {

  @Override
  protected Class<Permission> getDomainClass() {
    return Permission.class;
  }

  @Override
  public Page<PermissionDTO> findBy(
      @Param("name") String name,
      @Param("function") String function,
      @Param("pageable") Pageable pageable) {
    Permission obj = new Permission();
    obj.setName(name);
    obj.setFunction(function);
    Example<Permission> example = Example.of(obj);

    return findAll(example, pageable).map(Permission.DTO_CONVERTER);
  }
}

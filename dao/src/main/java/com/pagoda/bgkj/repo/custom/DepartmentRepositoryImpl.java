package com.pagoda.bgkj.repo.custom;

import com.pagoda.bgkj.api.dto.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.bgkj.domain.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Department扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class DepartmentRepositoryImpl extends BaseRepositoryCustomImpl<Department, Long>
    implements DepartmentRepositoryCustom {

  @Override
  protected Class<Department> getDomainClass() {
    return Department.class;
  }

  @Override
  public Page<DepartmentDTO> findBy(
      @Param("depType") Integer depType,
      @Param("depName") String depName,
      @Param("pageable") Pageable pageable) {
    Department obj = new Department();
    obj.setDepType(depType);
    obj.setDepName(depName);
    Example<Department> example = Example.of(obj);

    return findAll(example, pageable).map(Department.DTO_CONVERTER);
  }
}

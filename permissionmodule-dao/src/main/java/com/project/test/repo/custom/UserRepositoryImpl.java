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
 * User扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class UserRepositoryImpl extends BaseRepositoryCustomImpl<User, Long>
    implements UserRepositoryCustom {

  @Override
  protected Class<User> getDomainClass() {
    return User.class;
  }

  @Override
  public Page<UserDTO> findBy(
      @Param("name") String name,
      @Param("age") Integer age,
      @Param("weight") Double weight,
      @Param("sex") Boolean sex,
      @Param("registerTime") java.sql.Timestamp registerTime,
      @Param("registerDate") java.util.Date registerDate,
      @Param("height") java.math.BigDecimal height,
      @Param("roleName") String roleName,
      @Param("pageable") Pageable pageable) {
    User obj = new User();
    obj.setName(name);
    obj.setAge(age);
    obj.setWeight(weight);
    obj.setSex(sex);
    obj.setRegisterTime(registerTime);
    obj.setRegisterDate(registerDate);
    obj.setHeight(height);
    obj.setRoleName(roleName);
    Example<User> example = Example.of(obj);

    return findAll(example, pageable).map(User.DTO_CONVERTER);
  }
}

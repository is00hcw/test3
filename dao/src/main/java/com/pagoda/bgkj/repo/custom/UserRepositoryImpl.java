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
      @Param("password") String password,
      @Param("username") String username,
      @Param("pageable") Pageable pageable) {
    User obj = new User();
    obj.setPassword(password);
    obj.setUsername(username);
    Example<User> example = Example.of(obj);

    return findAll(example, pageable).map(User.DTO_CONVERTER);
  }
}

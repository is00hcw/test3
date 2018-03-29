package com.pagoda.user.repo.custom;

import com.pagoda.user.api.dto.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.user.domain.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Member扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class MemberRepositoryImpl extends BaseRepositoryCustomImpl<Member, Long>
    implements MemberRepositoryCustom {

  @Override
  protected Class<Member> getDomainClass() {
    return Member.class;
  }

  @Override
  public Page<MemberDTO> findBy(
      @Param("年龄") Integer 年龄,
      @Param("日期") java.util.Date 日期,
      @Param("name") String name,
      @Param("enumerate") String enumerate,
      @Param("pageable") Pageable pageable) {
    Member obj = new Member();
    obj.set年龄(年龄);
    obj.set日期(日期);
    obj.setName(name);
    obj.setEnumerate(enumerate);
    Example<Member> example = Example.of(obj);

    return findAll(example, pageable).map(Member.DTO_CONVERTER);
  }
}

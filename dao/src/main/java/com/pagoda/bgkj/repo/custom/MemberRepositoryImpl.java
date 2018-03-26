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
      @Param("memberName") String memberName,
      @Param("memberAge") Integer memberAge,
      @Param("depName") String depName,
      @Param("pageable") Pageable pageable) {
    Member obj = new Member();
    obj.setMemberName(memberName);
    obj.setMemberAge(memberAge);
    obj.setDepName(depName);
    Example<Member> example = Example.of(obj);

    return findAll(example, pageable).map(Member.DTO_CONVERTER);
  }
}

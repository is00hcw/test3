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
      @Param("depName") String depName,
      @Param("memberAge") Integer memberAge,
      @Param("memberName") String memberName,
      @Param("enumerateMultiple") String enumerateMultiple,
      @Param("enumerate") String enumerate,
      @Param("mDate") java.util.Date mDate,
      @Param("mDatetime") java.sql.Timestamp mDatetime,
      @Param("pageable") Pageable pageable) {
    Member obj = new Member();
    obj.setDepName(depName);
    obj.setMemberAge(memberAge);
    obj.setMemberName(memberName);
    obj.setEnumerateMultiple(enumerateMultiple);
    obj.setEnumerate(enumerate);
    obj.setMDate(mDate);
    obj.setMDatetime(mDatetime);
    Example<Member> example = Example.of(obj);

    return findAll(example, pageable).map(Member.DTO_CONVERTER);
  }
}

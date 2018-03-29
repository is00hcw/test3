package com.pagoda.user.repo;

import com.pagoda.user.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author PagodaGenerator
 * @generated
 */
@RunWith(SpringRunner.class)
@SpringBootTest
// @DataJpaTest
// @AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MemberRepositoryTest {

  @Autowired MemberRepository repository;

  @Test
  public void testFindBy() {}
}

package com.pagoda.bgkj.repo;

import com.pagoda.platform.jms.jpa.PagodaJpaRepositoryFactoryBean;
import com.pagoda.platform.jms.jpa.PagodaJpaRepositoryImpl;

import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author PagodaGenerator
 * @generated
 */
@SpringBootApplication
// @EnableJpaRepositories(basePackages = "com.pagoda.bgkj.repo",repositoryBaseClass =
// PagodaJpaRepositoryImpl.class, repositoryFactoryBeanClass = PagodaJpaRepositoryFactoryBean.class)
// @ComponentScan({"com.pagoda.bgkj.config"})
// @Import(DaoConfig.class)
public class TestApplication {

  @Bean
  public DataSource dataSource() {
    return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.HSQL).build();
  }

  @Bean
  public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
    return new JpaTransactionManager(emf);
  }

  @Bean
  public JpaVendorAdapter jpaVendorAdapter() {
    HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
    jpaVendorAdapter.setDatabase(Database.HSQL);
    jpaVendorAdapter.setGenerateDdl(true);
    return jpaVendorAdapter;
  }

  @Bean
  public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    LocalContainerEntityManagerFactoryBean lemfb = new LocalContainerEntityManagerFactoryBean();
    lemfb.setDataSource(dataSource());
    lemfb.setJpaVendorAdapter(jpaVendorAdapter());
    lemfb.setPackagesToScan("com.pagoda.bgkj");
    return lemfb;
  }

  public static void main(String[] args) {
    SpringApplication.run(TestApplication.class, args);
  }
}

package com.horarios.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableTransactionManagement
public class DatabaseConfig {

  @Value("${db.driver}")
  private String DB_DRIVER;

  @Value("${db.password}")
  private String DB_PASSWORD;

  @Value("${db.url}")
  private String DB_URL;

  @Value("${db.username}")
  private String DB_USERNAME;

  @Value("${hibernate.dialect}")
  private String HIBERNATE_DIALECT;

  @Value("${hibernate.show_sql}")
  private String HIBERNATE_SHOW_SQL;

  @Value("${hibernate.hbm2ddl.auto}")
  private String HIBERNATE_HBM2DDL_AUTO;

  @Value("${entitymanager.packagesToScan}")
  private String ENTITYMANAGER_PACKAGES_TO_SCAN;

  @Bean
  @Primary
  @ConfigurationProperties(prefix = "spring.datasource")
  public DataSource dataSource() {
    return DataSourceBuilder.create().build();

  }

  /*@Bean
  public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName(DB_DRIVER);
    dataSource.setUrl(DB_URL);
    dataSource.setUsername(DB_USERNAME);
    dataSource.setPassword(DB_PASSWORD);
    return dataSource;
  }*/

  @Bean
  public LocalSessionFactoryBean sessionFactory() {
    LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
    sessionFactoryBean.setDataSource(dataSource());
    sessionFactoryBean.setPackagesToScan(ENTITYMANAGER_PACKAGES_TO_SCAN);
    Properties hibernateProperties = new Properties();
    hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
    hibernateProperties.put("hibernate.show_sql", HIBERNATE_SHOW_SQL);
    hibernateProperties.put("hibernate.hbm2ddl.auto", HIBERNATE_HBM2DDL_AUTO);
    sessionFactoryBean.setHibernateProperties(hibernateProperties);

    return sessionFactoryBean;
  }

  @Bean
  public HibernateTransactionManager transactionManager() {
    HibernateTransactionManager transactionManager =
        new HibernateTransactionManager();
    transactionManager.setSessionFactory(sessionFactory().getObject());
    return transactionManager;
  }
/*
* <bean id="entityManagerFactoryBean" class="org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean">
      <property name="dataSource" ref="dataSource" />
      <!-- This makes /META-INF/persistence.xml is no longer necessary -->
      <property name="packagesToScan" value="com.howtodoinjava.demo.model" />
      <!-- JpaVendorAdapter implementation for Hibernate EntityManager.
           Exposes Hibernate's persistence provider and EntityManager extension interface -->
      <property name="jpaVendorAdapter">
         <bean class="org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter" />
      </property>
      <property name="jpaProperties">
         <props>
            <prop key="hibernate.hbm2ddl.auto">validate</prop>
            <prop key="hibernate.dialect">org.hibernate.dialect.MySQL5Dialect</prop>
         </props>
      </property>
   </bean>*/
  @Bean
  public org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean entityManagerFactory =
            new LocalContainerEntityManagerFactoryBean();

    entityManagerFactory.setDataSource(dataSource());
    entityManagerFactory.setPackagesToScan(ENTITYMANAGER_PACKAGES_TO_SCAN);
    entityManagerFactory.setJpaVendorAdapter(new org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter());
    Properties hibernateProperties = new Properties();
    hibernateProperties.put("hibernate.dialect", HIBERNATE_DIALECT);
    hibernateProperties.put("hibernate.show_sql", HIBERNATE_SHOW_SQL);
    hibernateProperties.put("hibernate.hbm2ddl.auto", HIBERNATE_HBM2DDL_AUTO);
    entityManagerFactory.setJpaProperties(hibernateProperties);

    return entityManagerFactory;
  }



} // class DatabaseConfig

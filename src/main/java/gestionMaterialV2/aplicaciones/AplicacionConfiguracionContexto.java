/**
 * 
 */
package gestionMaterialV2.aplicaciones;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;


/**
 * Definición de la configuración del contexto general de la aplicación
 * @author Talamino
 *
 */

@Configuration
@ComponentScan
@PropertySource("classpath:propiedades.properties")
@EnableJpaRepositories(basePackages = "gestionMaterialV2.aplicaciones.repositorios")
public class AplicacionConfiguracionContexto {

	@Autowired
	private Environment ev; 
	
	@Bean
    public DataSource dataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(ev.getProperty("database.driver"));
        dataSource.setUrl(ev.getProperty("database.url"));
        dataSource.setUsername(ev.getProperty("database.username"));
        dataSource.setPassword(ev.getProperty("database.password"));
        return dataSource;
    }
	
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();

		factoryBean.setDataSource(dataSource());
		factoryBean.setPackagesToScan("gestionMaterialV2.aplicaciones.entidades");

		HibernateJpaVendorAdapter hibernateJpa = new HibernateJpaVendorAdapter();
        hibernateJpa.setDatabase(Database.POSTGRESQL);
        hibernateJpa.setDatabasePlatform(ev.getProperty("hibernate.dialect"));
        hibernateJpa.setGenerateDdl(ev.getProperty("hibernate.generateDdl", Boolean.class));
        hibernateJpa.setShowSql(ev.getProperty("hibernate.show_sql", Boolean.class));
        
        factoryBean.setJpaVendorAdapter(hibernateJpa);
        
        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.hbm2ddl.auto", ev.getProperty("hibernate.hbm2ddl.auto"));
        jpaProperties.put("hibernate.show_sql", ev.getProperty("hibernate.show_sql"));
        jpaProperties.put("hibernate.format_sql", ev.getProperty("hibernate.format_sql"));

        factoryBean.setJpaProperties(jpaProperties);
		
		
		return factoryBean;
	}


	@Bean
	public JpaTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return transactionManager;
	}

}

package vn.spring.api.business.configuration;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.jca.cci.connection.TransactionAwareConnectionFactoryProxy;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import com.querydsl.sql.SQLQueryFactory;
import com.querydsl.sql.SQLTemplates;
import com.querydsl.sql.SQLTemplatesRegistry;
import com.querydsl.sql.spring.SpringConnectionProvider;
import com.querydsl.sql.spring.SpringExceptionTranslator;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableJpaAuditing
@RequiredArgsConstructor
public class RdbConfig {
//	@Bean
//	public com.querydsl.sql.Configuration querydslConfiguration(DataSource dataSource) throws SQLException {
//		SQLTemplates templates = null;
//		try (Connection connection = dataSource.getConnection()) {
//			templates = new SQLTemplatesRegistry().getBuilder(connection.getMetaData()).build();
//		}
//		var configuration = new com.querydsl.sql.Configuration(templates);
//		configuration.setExceptionTranslator(new SpringExceptionTranslator());
////		configuration.addListener(new Querydsl);
//		return configuration;
//	}
//
//	@Bean
//	public SQLQueryFactory sqlQueryFactory(DataSource dataSource,
//			com.querydsl.sql.Configuration querydslConfiguration) {
//		var transactionAwareDataSourceProxy = new TransactionAwareDataSourceProxy(dataSource);
//		var provider = new SpringConnectionProvider(transactionAwareDataSourceProxy);
//		var sqlQueryFactory = new SQLQueryFactory(querydslConfiguration, provider);
//		return sqlQueryFactory;
//	}
}

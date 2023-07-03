package vn.spring.api.business.configuration;

import javax.sql.DataSource;

import com.querydsl.sql.Configuration;
import com.querydsl.sql.MySQLTemplates;
import com.querydsl.sql.SQLQueryFactory;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class QuerydslConfig {

    private final DataSource dataSource; // Inject your DataSource here

    public QuerydslConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public SQLQueryFactory queryFactory() {
        Configuration configuration = new Configuration(new MySQLTemplates());
        return new SQLQueryFactory(configuration, dataSource);
    }
}

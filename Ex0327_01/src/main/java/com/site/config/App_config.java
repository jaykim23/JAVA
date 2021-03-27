package com.site.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
public class App_config {
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
	SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
	sessionFactory.setDataSource(dataSource);
																			//sql구문이 여기에 있다.라는 뜻
																			//**은 하위폴더라는 뜻 mapper안의 하위폴더 모든 것에서 .xml붙은건 다 들고와
	Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/**/*.xml");
	sessionFactory.setMapperLocations(res);

	return sessionFactory.getObject();
	}

	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
	System.out.println("sqlSessionFactory : " + sqlSessionFactory);
	return new SqlSessionTemplate(sqlSessionFactory);
	}
	//이걸 마지막으로 mybatis DB연결은 끝남
}

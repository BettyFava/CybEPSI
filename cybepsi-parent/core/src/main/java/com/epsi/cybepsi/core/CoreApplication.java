package com.epsi.cybepsi.core;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
@SpringBootApplication
@MapperScan( basePackages = CoreApplication.PACKAGE_DAO )
public class CoreApplication {
	

	    public static final String     PACKAGE_DAO = "com.epsi.cybepsi.core.dao";


	    @Bean
	    public SqlSessionFactory sqlSessionFactory( final DataSource dataSource ) throws Exception {
	        final SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
	        ssfb.setDataSource( dataSource );
	        ssfb.setTypeAliasesPackage( "com.epsi.cybepsi" );
	     

	        //        ssfb.afterPropertiesSet();

	        final PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
	        ssfb.setMapperLocations( resolver.getResources( "classpath*:mapper/**/*Mapper.xml" ) );

	       
	        final SqlSessionFactory ssf = ssfb.getObject();

	        ssf.getConfiguration().getTypeAliasRegistry().registerAliases( "com.epsi.cybepsi" );
	    

	        return ssfb.getObject();
	    }

	 

	    public static void main( final String[] args ) {
	        //        SpringApplication.run( CoreConfiguration.class );
	    }
	}


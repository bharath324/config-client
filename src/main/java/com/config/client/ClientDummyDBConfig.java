package com.config.client;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ClientDummyDBConfig {

	
		@Bean("dummyDatasource")
		@Primary
		@ConfigurationProperties(prefix = "ecr.datasource")
		public DataSource ecrDataSource() {
			return DataSourceBuilder.create().build();
		}
}

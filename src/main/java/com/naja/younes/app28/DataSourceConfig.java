package com.naja.younes.app28;

import com.external.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
public class DataSourceConfig {
    @Bean(name = "datasource")
    @Profile("development")
    DataSource development(){
        return new DataSource("development-url.com", 8080);
    }

    @Bean(name = "datasource")
    @Profile("production")
    DataSource production(){
        return new DataSource("production-url.com", 80);
    }
}

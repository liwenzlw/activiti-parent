package com.example.demo.conf;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by zenglw on 2017/12/21.
 */
@Configuration
public class DBConfig {
    @Bean
    public DataSource database() {
        return DataSourceBuilder.create()
                .url("jdbc:mysql://127.0.0.1:3306/activiti-spring-boot?characterEncoding=UTF-8")
                .username("root")
                .password("123456")
                .driverClassName("com.mysql.jdbc.Driver")
                .build();
    }
}

package com.xw.demo.springbootdemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author xw
 * @date 2019-05-21 23:56
 */
@Configuration
public class JdbcConfig {

    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
/*        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl();
        dataSource.setUsername();
        dataSource.setPassword();*/
        return dataSource;
    }

}

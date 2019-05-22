package com.xw.demo.springbootdemo.config;


import javax.sql.DataSource;

/**
 * @author xw
 * @date 2019-05-21 23:56
 */
//@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {

    /*@Bean
    public DataSource dataSource(JdbcProperties prop){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(prop.getDriverClassName());
        dataSource.setUrl(prop.getUrl());
        dataSource.setUsername(prop.getUsername());
        dataSource.setPassword(prop.getPassword());
        return dataSource;
    }*/

    /**
     * 第二种属性注入方式
     * @return
     */
//    @Bean
//    @ConfigurationProperties(prefix = "jdbc")
//    public DataSource dataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
//
//        return dataSource;
//    }

}

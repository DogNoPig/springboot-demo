package com.xw.demo.springbootdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author xw
 * @date 2019-05-22 00:07
 */
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {
    String url;
    String driverClassName;
    String username;
    String password;
}

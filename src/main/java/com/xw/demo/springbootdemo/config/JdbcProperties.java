package com.xw.demo.springbootdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 从配置文件中获取配置的属性值
 * spring boot 属性注入
 * 可复用
 * @author xw
 * @date 2019-05-22 00:07
 */
//@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {
    String url;
    String driverClassName;
    String username;
    String password;
}

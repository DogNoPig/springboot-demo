package com.xw.demo.springbootdemo.controller;

import com.xw.demo.springbootdemo.pojo.User;
import com.xw.demo.springbootdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * 测试
 * @author xw
 * @date 2019-05-21 23:47
 */
@RestController
@Slf4j
@RequestMapping("/user")
public class HelloController {

//    @Autowired
//    private DataSource dataSource;

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User hello(@PathVariable("id")Integer id){
//        System.out.println("hello method is running");
        log.debug("hello method is running");
        return userService.queryById(id);
    }


}

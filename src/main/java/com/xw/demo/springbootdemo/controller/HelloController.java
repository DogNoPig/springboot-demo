package com.xw.demo.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 * @author xw
 * @date 2019-05-21 23:47
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "20190521 hello world -- xw springBoot";
    }


}

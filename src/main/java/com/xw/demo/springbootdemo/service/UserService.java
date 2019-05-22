package com.xw.demo.springbootdemo.service;

import com.xw.demo.springbootdemo.mapper.UserMapper;
import com.xw.demo.springbootdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xw
 * @date 2019/5/22 14:48
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

    //事物
    @Transactional
    public void insertUser(User user){
        userMapper.insert(user);
    }

}

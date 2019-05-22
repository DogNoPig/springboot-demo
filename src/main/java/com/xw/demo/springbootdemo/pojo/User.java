package com.xw.demo.springbootdemo.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * 用户信息
 * @author xw
 * @date 2019/5/22 10:44
 */
@Data
@Table(name = "t_xw_s_user")
public class User {
    //主键 插入时返回主键
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String userName;
    private String password;

    private String email;
    private String phoneNum;
    private Integer status;
    //非持久化
    @Transient
    private String note;

}

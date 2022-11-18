package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: t-hongwei.liu
 * @Description TODO
 * @date 2022/11/12 10:17
 * @Version 1.0
 */
@Service
public class UserService {

//    @Autowired
//    @Qualifier(value = "UserDaoImpl1")
    @Resource
    private UserDao userDao;

    @Value(value = "abc")
    private String name;

    public void add(){
        System.out.println("UserService add方法执行了！"+name);
        userDao.add();
    }

}

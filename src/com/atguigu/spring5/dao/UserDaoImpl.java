package com.atguigu.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: t-hongwei.liu
 * @Description TODO
 * @date 2022/11/12 12:22
 * @Version 1.0
 */
@Repository(value = "UserDaoImpl1")
public class UserDaoImpl implements UserDao{

    @Override
    public void add() {
        System.out.println("UserDao方法执行了！");
    }
}

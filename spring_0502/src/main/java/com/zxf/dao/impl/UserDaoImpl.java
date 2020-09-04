package com.zxf.dao.impl;

import com.zxf.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public UserDaoImpl(){
        System.out.println("UserDaoImpl对象创建了。");
    }
    public void saveUser() {
        System.out.println("UserDaoImpl方法执行了。。。");
    }
}

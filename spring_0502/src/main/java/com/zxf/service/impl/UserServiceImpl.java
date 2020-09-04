package com.zxf.service.impl;

import com.zxf.service.UserService;

public class UserServiceImpl implements UserService {
    public UserServiceImpl(){
        System.out.println("UserServiceImpl对象创建了。");
    }
    public void saveUser() {
        System.out.println("UserServiceImpl方法执行了。");
    }
}

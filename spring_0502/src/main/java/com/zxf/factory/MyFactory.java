package com.zxf.factory;

import com.zxf.dao.UserDao;
import com.zxf.dao.impl.UserDaoImpl;

public class MyFactory {
    public MyFactory(){
        System.out.println("MyFactory对象创建了。");
    }
    public static UserDao getUserDaoImpl(){
        return new UserDaoImpl();
    }
}

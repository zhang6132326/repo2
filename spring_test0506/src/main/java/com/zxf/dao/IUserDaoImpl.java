package com.zxf.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao1")
public class IUserDaoImpl implements IUserDao {
    public IUserDaoImpl(){
        System.out.println("IUserDaoImpl对象创建了。111111");
    }
    public void saveUserDao() {
        System.out.println("Dao接口中的saveUser()方法执行了。");
    }
}

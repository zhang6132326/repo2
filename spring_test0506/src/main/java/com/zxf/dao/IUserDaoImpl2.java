package com.zxf.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao2")
public class IUserDaoImpl2 implements IUserDao {
    public IUserDaoImpl2(){
        System.out.println("IUserDaoImpl2对象创建2222222");
    }
    public void saveUserDao() {
        System.out.println("dao层的2号类的方法调用了。");
    }
}

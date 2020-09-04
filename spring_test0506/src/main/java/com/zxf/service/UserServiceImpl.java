package com.zxf.service;

import com.zxf.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired             //下面任选其一即可
    @Qualifier("userDao2")//1或者这里指定@Repository("userDao1")名字一致
        private IUserDao userDao;//2或者这个userDao要和Dao实现类中名字一致@Repository("userDao1")
        public UserServiceImpl(){
        System.out.println("UserServiceImpl对象创建了。");
    }
    public void saveUserService() {
        userDao.saveUserDao();
        System.out.println("service接口中的saveUser()方法执行了。");
    }
}

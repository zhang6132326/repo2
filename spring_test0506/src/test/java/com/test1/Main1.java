package com.test1;
import com.zxf.dao.IUserDao;
import com.zxf.service.IUserService;
import com.zxf.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main1 {
    @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        IUserService bean = ac.getBean(UserServiceImpl.class);
        bean.saveUserService();
        //IUserDao iUserDao=(IUserDao) ac.getBean("userDao");
       // iUserDao.saveUserDao();
    }
}
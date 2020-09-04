package com.zxf.test1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
public class My1Service {
    @Autowired
    /*
         可以在这里修改选择使用那个相同接口的不同实现类。
     */
    @Qualifier("uu")
    //@Qualifier("umysql")
    UserDao userDao;
    public User login(String u,String p){
        System.out.println("Service 接受到请求，开始处理。");
       return userDao.getUserByName(u);
    }
}

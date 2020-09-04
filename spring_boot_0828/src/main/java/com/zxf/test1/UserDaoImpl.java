package com.zxf.test1;
import org.springframework.stereotype.Repository;

@Repository("uu")
public class UserDaoImpl implements UserDao {
    @Override
    public User getUserByName(String u) {
        System.out.println("uu用户查找中。。。");
        return new User();
    }
}

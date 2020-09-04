package com.zxf.test1;
import org.springframework.stereotype.Repository;

@Repository("umysql")
public class UserDaoMysqlImpl implements UserDao {
    @Override
    public User getUserByName(String u) {
        System.out.println("mysql用户查找中。。。");
        return new User();
    }
}

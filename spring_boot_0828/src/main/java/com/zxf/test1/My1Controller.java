package com.zxf.test1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller("mycon1")
public class My1Controller {
    @Autowired
    My1Service my1Service;
    public String list(){
        String name="zhang3";
        String pwd="123";
        User user=my1Service.login(name,pwd);
        if(user!=null){
            System.out.println("Hello:"+name);
            return "登录OK";
        }else {
            return "登录失败";
        }
    }
}

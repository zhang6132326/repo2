package com.zxf.test1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main1 {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("Spring1.xml");
        My1Controller bean = app.getBean("mycon1", My1Controller.class);
         String info=bean.list();
         System.out.println(info);
    }
}

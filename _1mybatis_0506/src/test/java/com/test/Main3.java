package com.test;

import com.zxf.bean.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



public class Main3 {
    @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans2.xml");
        Animal cat = ac.getBean("cat", Animal.class);
        cat.sleep();
    }

    @Test
    public void test2(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans2.xml");
        Animal dog=ac.getBean("dog",Animal.class);
        dog.sleep();
    }
    @Test
    public void test3(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans2.xml");
        Animal dog=ac.getBean("pig",Animal.class);
        dog.sleep();
    }
    @Test
    public void test4(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans2.xml");
        Animal dog=ac.getBean("pig1",Animal.class);
        dog.sleep();
    }
}

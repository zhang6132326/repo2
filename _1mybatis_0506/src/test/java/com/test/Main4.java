package com.test;

import com.zxf.bean2.MathI;
import com.zxf.bean2.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {
    @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans3.xml");
        MathI mathImpl = ac.getBean("mathImpl", MathI.class);
         mathImpl.add(23,5);
         mathImpl.mul(9,3);

        Person student=ac.getBean("student",Person.class);
        student.eat();

        Person teacher=ac.getBean("teacher",Person.class);
        teacher.eat();


    }
}

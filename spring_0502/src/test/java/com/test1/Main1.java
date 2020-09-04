package com.test1;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
     }
}

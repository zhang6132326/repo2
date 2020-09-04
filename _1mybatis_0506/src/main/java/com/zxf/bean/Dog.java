package com.zxf.bean;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    public void sleep() {
        System.out.println("狗睡觉了。。。");

    }
}

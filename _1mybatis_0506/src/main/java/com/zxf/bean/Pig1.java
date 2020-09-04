package com.zxf.bean;

import org.springframework.stereotype.Component;

@Component
public class Pig1 implements Animal {
    public void sleep() {
        System.out.println("老母猪睡觉了11111111");
    }
}

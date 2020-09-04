package com.zxf.bean;

import org.springframework.stereotype.Component;

@Component
public class Pig implements Animal {
    public void sleep() {
        System.out.println("老母猪睡觉了");
    }
}

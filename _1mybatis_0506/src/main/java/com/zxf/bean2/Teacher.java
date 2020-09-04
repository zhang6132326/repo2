package com.zxf.bean2;

import org.springframework.stereotype.Component;

@Component
public class Teacher implements Person {
    public void eat() {
        System.out.println("老师吃饭饭");
    }
}

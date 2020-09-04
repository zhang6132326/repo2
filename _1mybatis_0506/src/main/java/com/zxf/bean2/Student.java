package com.zxf.bean2;

import org.springframework.stereotype.Component;

@Component
public class Student implements Person {
    public void eat() {
        System.out.println("学生吃");
    }
}

package com.zxf.bean;

import org.springframework.stereotype.Component;

@Component //注解方式定义的bean标签
public class MyAspLog {
    public void beforeMethod(){
        System.out.println("......我是前置通知");
    }
    public void afterMethod(){
        System.out.println("我是后置通知......");
    }
}

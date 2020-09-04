package com.zxf.test2;

public class Main2 {
    public static void main(String[] args) {
        Girl girl=new Girl();
        Boy boy=new Boy();
        Human proxyGirl=new ProxyGirl(boy);
        proxyGirl.eat();
    }
}

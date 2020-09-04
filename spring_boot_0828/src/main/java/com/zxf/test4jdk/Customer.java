package com.zxf.test4jdk;


public class Customer implements OrderInterface {
    @Override
    public String order(String foodName) {
        return "已经下单："+foodName;
    }

    @Override
    public void test() {
            System.out.println("我是Customer的test()");
    }

    @Override
    public void test2() {
        System.out.println("我是Customer的test2()");
    }
}

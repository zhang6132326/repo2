package com.zxf.test3;

public class DeliveryClierk2 implements OrderInterface {

    private OrderInterface source;
    public DeliveryClierk2(OrderInterface source){
        this.source=source;
    }
    @Override
    public String order(String foodname) {
        String result= source.order(foodname);
        System.out.println("已经接受订单，正在前往取餐中。。。");
        System.out.println("已经取餐，正在派送。。。");
        return result+",已经损坏。。";
    }
}

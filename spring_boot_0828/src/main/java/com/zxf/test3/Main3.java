package com.zxf.test3;

public class Main3 {
    public static void main(String[] args) {
        /*
        Customer customer=new DeliveryClierk();
        System.out.println(customer.order("鸡腿"));
         */
        //顾客
        Customer customer=new Customer();
        //代理对象，外卖小哥
        OrderInterface deliveryClerk=new DeliveryClierk2(customer);
      String result=  deliveryClerk.order("冷面");
      System.out.println(result);


    }
}

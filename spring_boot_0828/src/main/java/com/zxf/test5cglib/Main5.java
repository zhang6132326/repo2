package com.zxf.test5cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Main5 {
    public static void main(String[] args) {
        //创建一个顾客
        Customer customer=new Customer();
      Customer deliverClier=(Customer)  Enhancer.create(customer.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                if("order".equals(method.getName())){
                    Object result = method.invoke(customer, objects);
                    System.out.println("11111");
                    System.out.println("22222");
                    return result+",添加了不明东西";
                }else {
                    return method.invoke(customer,args);
                }
            }
        });
        deliverClier.test();
        deliverClier.test2();

        String result = deliverClier.order("Spring");
        System.out.println(result);


    }
}

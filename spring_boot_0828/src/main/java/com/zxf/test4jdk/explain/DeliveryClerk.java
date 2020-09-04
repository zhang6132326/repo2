package com.zxf.test4jdk.explain;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
  我们模拟一下Proxy.newProxyInstance()方法的源码分析
 */
public class DeliveryClerk implements OrderInterface {
    //接受外部传入的InvocationHandler对象
    private final InvocationHandler handler;
    public DeliveryClerk(InvocationHandler handler) {
        this.handler=handler;
    }

    @Override
    public String order(String foodName) {
        //每个方法的实现，实际上并没有做其他事情，直接调用了InvocationHandler的invoke方法

        try{
            //调用order方法，则反射获取order对应的method对象，传入invoke中
            Method method=OrderInterface.class.getMethod("order", String.class);
            handler.invoke(this,method,new Object[]{foodName});
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }

        return null;
    }

    @Override
    public void test() {
        try{
            Method method=OrderInterface.class.getMethod("test");
            Object result=handler.invoke(this,method,null);

        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
    }

    @Override
    public void test2() {
        try{
            Method method=OrderInterface.class.getMethod("test2");
            Object result=handler.invoke(this,method,null);
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
    }
}

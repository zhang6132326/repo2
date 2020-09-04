package com.zxf.test4jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main4 {
    public static void main(String[] args) {
        //准备一个目标类对象，顾客类
        Customer customer=new Customer();
        //使用JDK的API 生成一个动态的代理对象。

        OrderInterface deliveryClerk=(OrderInterface) Proxy.newProxyInstance(
                customer.getClass().getClassLoader(),
                customer.getClass().getInterfaces(),
                /* lamb方式
                (proxy,method,args1)->{
                    return null;
                }
                 */
                //匿名内部类方式
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                              /*
                                 如果方法没有参数，例如test() ,test2();你在这里查看参数就会有空指针异常。
                               */
                        //System.out.println(method.getName()+"-->我执行了:"+args[0]);
                        if("order".equals(method.getName())) {
                            Object result = method.invoke(customer, args);
                            System.out.println("处理11111");
                            System.out.println("处理22222");
                            return result + ",已经损坏了！！！！";
                        }else {
                            return method.invoke(customer,args);
                        }
                    }
                }
        );
        String result=deliveryClerk.order("java");
        System.out.println(result);
        deliveryClerk.test();//如果方法没有参数，所有invoke方法中的Object[]args 就会有空指针异常。
        deliveryClerk.test2();
    }
}

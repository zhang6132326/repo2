package com.zxf.j8.t1;
import org.junit.jupiter.api.Test;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Comparator;
import java.util.function.Consumer;
/*
      Lambda表达式使用
      1举例：(a1,a2)->Integer.compare(a1,a2);
      2格式：
          ->:lambda操作符 或 箭头操作符
          ->左边：lambda形参列表（接口中抽象方法的形参列表）
          ->右边：lambda体 （重写抽象方法的方法体）

 */
public class LambdaTest1 {
    //语法格式一：无参，无返回值。
    @Test
    public void test1(){
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable正常匿名内部类写法");
            }
        };
        r1.run();
        System.out.println("*******************************************************");
        Runnable r2=()->{
          System.out.println("Runnable的Lambda写法");
        };
        r2.run();
    }
    //语法格式二：有一个参数，但是没有返回值。
    @Test
    public void test2(){
        Consumer<String> con=new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Consumer正常匿名内部类写法"+s);
            }
        };
        con.accept("jsp");
        System.out.println("*******************************************************");
        Consumer<String> con2=(String f)->{
            System.out.println("Consumer使用Lambda1写法");
        };
        con2.accept("oracle");
        System.out.println("*******************************************************");
        Consumer<String> con3=(f)->{
            System.out.println("Consumer使用Lambda2写法"+f);
        };
        con3.accept("java");
        System.out.println("*******************************************************");
        Consumer<String> con4=f->{
            System.out.println("Consumer使用Lambda3写法"+f);
        };
        con4.accept("reids");
    }
    //格式三：2个参数 有返回值的
    @Test
    public void test3(){
        Comparator<Integer> com1=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        System.out.println("********************正常写法*********************");
        int compare1 = com1.compare(4, 5);
        System.out.println(compare1);
        System.out.println("**************************************************");
        System.out.println("****************Lambda带有2个参数，有返回值写法********************");
        Comparator<Integer> com2=(a1,a2)->{
          return Integer.compare(a1,a2);
        };
        int compare2 = com2.compare(56, 56);
        System.out.println(compare2);
        System.out.println("**************************************************");
        System.out.println("***********Lambda带有2个参数，有返回值写法的简写，省略大括号*****************");
        Comparator<Integer> com3=(x1,x2)->Integer.compare(x1,x2);
        System.out.println(com3.compare(5,1));

    }

}
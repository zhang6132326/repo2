package com.zxf.j8.t1;
import org.junit.jupiter.api.Test;
import java.util.Comparator;
/*
      Lambda表达式
 */
public class LambdaTest {
    @Test
    public void test1(){
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };
        r1.run();
        System.out.println("******************");
        Runnable r2=()->{
          System.out.println("我是通过Lambda方式实现的。");
        };
        r2.run();
    }
    @Test
    public void test2(){
        Comparator<Integer> com1=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        int compare1 = com1.compare(32, 3);
        System.out.println(compare1);
        System.out.println("******************");
        //Lambda写法
        Comparator<Integer> com2=(x1,x2)->{
             return  Integer.compare(x1,x2);
        };
        int compare2 = com2.compare(53, 53);
        System.out.println(compare2);
        System.out.println("******************");
        //方法引用
        Comparator<Integer> com3=Integer::compare;
        int compare3 = com3.compare(45, 45);
        System.out.println(compare3);
    }
}
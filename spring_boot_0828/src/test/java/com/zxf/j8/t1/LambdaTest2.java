package com.zxf.j8.t1;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class LambdaTest2 {

    @Test
    public void test1(){
        List<String> list= Arrays.asList("计算机","汉语言","法语","德语","马拉西亚语言","计算机开发语言","智能计算机设备");
        List<String> filterStrs=filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("计算机");
            }
        });
        System.out.println(filterStrs);
        System.out.println("-----------------------");
        List<String>filterStrs2=filterString(list,str->{
           return str.contains("语");
        });
        System.out.println(filterStrs2);
    }



    //根据给定的规则，过滤集合中的字符串。此规则由Predicate的方法决定。
    public List<String> filterString(List<String>list, Predicate<String>pre){
        ArrayList<String> filterList=new ArrayList<>();
        for(String s:list){
            if(pre.test(s)){
                filterList.add(s);
            }
        }
        return filterList;
    }
}

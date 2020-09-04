package com.test;

import com.zxf.pojo.Flower;
import com.zxf.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main1 {
    @Test
    public void testFindall(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        IAccountService ias=ac.getBean("accountService",IAccountService.class);
        List<Flower> allFlower = ias.findAllFlower();
        for(Flower f:allFlower){
            System.out.print(f.getId()+" ");
            System.out.print(f.getPrice()+" ");
            System.out.print(f.getName()+" ");
            System.out.println(f.getProduction());
        }
    }
    @Test
    public void testFindFlower(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        IAccountService ias=ac.getBean("accountService",IAccountService.class);
        Flower flowerById = ias.findFlowerById(1);
        System.out.println(flowerById.getName()+","+flowerById.getProduction());
    }
    @Test
    public void testSaveFlower(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        IAccountService ias=ac.getBean("accountService",IAccountService.class);
        Flower flower=new Flower();
         flower.setProduction("我是测试的");
         flower.setName("wo shicetext");
         flower.setPrice(23.67);
        ias.saveFlower(flower);
    }

    @Test
    public void testupdateeFlower(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        IAccountService ias=ac.getBean("accountService",IAccountService.class);
        Flower flower=new Flower();
        flower.setId(1421);
        flower.setProduction("我是测试的");
        flower.setName("还是学中文把");
        flower.setPrice(23.67);
        ias.updateFlower(flower);
    }

    @Test
    public void testdelFlower(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        IAccountService ias=ac.getBean("accountService",IAccountService.class);
        ias.delFlower(1419);
    }

}

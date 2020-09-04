package com.test;
import com.zxf.pojo.Flower;
import com.zxf.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")
public class Main2 {
    @Autowired
    private IAccountService ac=null;
    @Test
    public void testFindAll(){
        List<Flower> flowers=ac.findAllFlower();
        for(Flower f:flowers){
            System.out.print(f.getId()+" ");
            System.out.print(f.getProduction()+" ");
            System.out.println(f.getName());
        }
    }

}

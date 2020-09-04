package com.zxf.dao;
import com.zxf.pojo.Flower;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import java.util.List;
public class UserDaoImpl implements IUserDao {
    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public List<Flower> findAllFlower() {
        try{
            return runner.query("select * from flower",new BeanListHandler<Flower>(Flower.class));
        }catch (Exception e){
              throw new RuntimeException(e);
        }
     }

    public Flower findFlowerById(Integer id) {
         try{
             return runner.query("select * from flower where id=?",new BeanHandler<Flower>(Flower.class),id);
         }catch (Exception e){
              throw new RuntimeException(e);
         }
    }

    public void saveFlower(Flower flower) {
         try {
              runner.update("insert into flower (name,price,production) values(?,?,?)",flower.getName(),flower.getPrice(),flower.getProduction());
         }catch (Exception e){
             throw new RuntimeException(e);
         }
    }

    public void updateFlower(Flower flower) {
         try {
             runner.update("update flower set name=?,price=?,production=? where id=?",flower.getName(),flower.getPrice(),flower.getProduction(),flower.getId());
         }catch (Exception e){
             throw new RuntimeException(e);
         }
    }

    public void delFlower(Integer id) {
        try {
            runner.update("delete from flower where id=?",id);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

package com.zxf.service;
import com.zxf.dao.IUserDao;
import com.zxf.pojo.Flower;
import java.util.List;
public class AccountServiceImpl implements IAccountService {

       private IUserDao iUserDao;

    public void setiUserDao(IUserDao iUserDao) {
        this.iUserDao = iUserDao;
    }

    public List<Flower> findAllFlower() {
        return  iUserDao.findAllFlower();
    }

    public Flower findFlowerById(Integer id) {
        return iUserDao.findFlowerById(id);
    }

    public void saveFlower(Flower flower) {
        iUserDao.saveFlower(flower);
    }

    public void updateFlower(Flower flower) {
        iUserDao.updateFlower(flower);
    }

    public void delFlower(Integer id) {
        iUserDao.delFlower(id);
    }
}

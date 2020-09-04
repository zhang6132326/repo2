package com.zxf.service;

import com.zxf.pojo.Flower;

import java.util.List;

public interface IAccountService {
    //查询所有记录
    List<Flower> findAllFlower();
    //查询一个
    Flower findFlowerById(Integer id);
    //保存
    public void saveFlower(Flower flower);
    //修改
    public void updateFlower(Flower flower);
    //删除
    public void delFlower(Integer id);

}

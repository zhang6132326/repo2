package com.zxf.service;
import com.zxf.dao.CityDao;
import com.zxf.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CityService {
    @Autowired
    CityDao cityDao;
    public List<City> findAll(){
     return  cityDao.findAll();
    }
    public String add(Integer id,String name){
        City city=new City();
          city.setId(id);
          city.setName(name);
          try{
              cityDao.save(city);
              return "保存成功。";
          }catch (Exception e){
              return "保存失败！";
          }
    }
}
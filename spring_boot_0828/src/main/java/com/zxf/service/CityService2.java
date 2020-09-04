package com.zxf.service;

import com.zxf.dao.CityRepostory;
import com.zxf.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityService2 {
     @Autowired
     CityRepostory cityRepostory;
    public List<City> findAll(){
        return  cityRepostory.findAll();
    }

    public City findOne(Integer id) {
       return cityRepostory.getOne(id);
    }
}

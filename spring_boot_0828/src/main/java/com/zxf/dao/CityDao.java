package com.zxf.dao;

import com.zxf.domain.City;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class CityDao {
    /*
        在内存中虚拟出一份数据
        List Map
     */
    static Map<Integer,City> dataMap= Collections.synchronizedMap(new HashMap<Integer,City>());

    public List<City> findAll(){
        return new ArrayList<>(dataMap.values());
    }
    public void save(City city) throws Exception{
        City data=dataMap.get(city.getId());
        if(data!=null){
            throw new Exception("数据已经存在");
        }else {
            dataMap.put(city.getId(), city);
        }
    }

}

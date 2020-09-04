package com.zxf.controller;
import com.zxf.domain.City;
import com.zxf.service.CityService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
@Controller
@RequestMapping("city2")
public class MyController2 {
    @Autowired
    CityService2 cityService2;
    @RequestMapping("list2")
    public String list(Model map){
        List<City> all = cityService2.findAll();
        map.addAttribute("list",all);
        return "list";
    }
    @RequestMapping("list2_one/{id}")
    public String getOne(@PathVariable("id")Integer id,Model model){
        City city=cityService2.findOne(id);
        System.out.println(city.getName());
        model.addAttribute("city",model);
        return "one";
    }
}
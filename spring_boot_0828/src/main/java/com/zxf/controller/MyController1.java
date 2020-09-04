package com.zxf.controller;
import com.zxf.domain.City;
import com.zxf.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

//@RestController //它是无效的。不支持模板引擎
@Controller  //第一要使用它配置该类
@RequestMapping("my1")
public class MyController1 {
    @Autowired
    CityService cityService;

    @RequestMapping("list")
    public String list(ModelMap map){
        List<City> list=cityService.findAll();
        map.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("add")
    public String  add(@RequestParam("id") Integer id,@RequestParam("name") String name){
        String success=cityService.add(id,name);
        System.out.println("__________---2309239032");
        return "add";
    }
    @RequestMapping("addPage")
    public String  addPage(){
       // String success=cityService.add(id,name);
        return "add";
    }








////////////////////////////////////////////
    @RequestMapping("hello")
    public String hello(ModelMap modelMap){
          modelMap.addAttribute("name","小峰6132326");
        return "list";
    }
}
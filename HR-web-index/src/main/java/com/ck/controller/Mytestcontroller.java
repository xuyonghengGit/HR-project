package com.ck.controller;

import com.ck.entity.Mytest;
import com.ck.service.Mytestsercice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Mytestcontroller {
    @Autowired
    private Mytestsercice Mytestdao;
    //测试查询
    @RequestMapping("queryAllIndexMytest")
    public String queryAllIndexMytest(ModelMap map){
        List<Mytest> mytests = Mytestdao.QueryAllIndexTest();
        map.addAttribute("mytestslist",mytests);
        return "Mytest";
    }
}

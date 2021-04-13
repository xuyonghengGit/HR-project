package com.ck.controller;

import com.ck.entity.Config_file_third_kind;
import com.ck.service.Iconfig_file_third_kindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Config_file_third_kindZengController {
    @Autowired
    private Iconfig_file_third_kindService dao;
    @RequestMapping("querythird")
    @ResponseBody
    public List<Config_file_third_kind> querythird(int second_kind_id){
        List<Config_file_third_kind> kindss = dao.querythird(second_kind_id);
        System.out.println(kindss);
        return kindss;
    }
}

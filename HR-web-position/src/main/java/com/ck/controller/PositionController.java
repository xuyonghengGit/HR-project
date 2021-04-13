package com.ck.controller;

import com.ck.entity.Config_file_first_kind;
import com.ck.service.Iconfig_file_first_kindService;
import com.ck.service.impl.Iconfig_file_first_kindServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PositionController {
    //
    @Autowired
    private Iconfig_file_first_kindService dao;


    @RequestMapping("queryOrganization1")
    public String queryAll(ModelMap map) {
        //2.Config_file_first_kind ：一级机构设置
        List<Config_file_first_kind> list = dao.queryAll();
        map.addAttribute("Config_file_first_kindlistQueryAll",list);
        return "client/first_kind";
    }
}

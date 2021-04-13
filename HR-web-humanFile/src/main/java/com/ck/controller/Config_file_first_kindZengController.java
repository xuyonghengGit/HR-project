package com.ck.controller;

import com.ck.entity.Config_file_first_kind;
import com.ck.service.Iconfig_file_first_kindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Config_file_first_kindZengController {
    @Autowired
    //把Iconfig_file_first_kindService中的东西放入dao
    private Iconfig_file_first_kindService dao;
    @RequestMapping("queryAllFirstFile")
    @ResponseBody
    //查询全部一级机构
    public List<Config_file_first_kind> queryAllFirst(){
        List<Config_file_first_kind> fileFirstKinds = dao.queryAll();
        return fileFirstKinds;
    }
}

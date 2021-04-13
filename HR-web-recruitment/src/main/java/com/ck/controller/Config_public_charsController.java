package com.ck.controller;

import com.ck.dao.Iconfig_majorDao;
import com.ck.dao.Iconfig_public_charDao;
import com.ck.entity.Config_major;
import com.ck.entity.Config_major_kind;
import com.ck.entity.Config_public_char;
import com.ck.service.Iconfig_major_kindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Config_public_charsController {

    @Autowired
    private Iconfig_public_charDao iconfig_public_charDao;


    //查询Config_public_char所有ajax方式插入下拉框
    @RequestMapping("queryBychar")
    @ResponseBody
    public List<Config_public_char> queryBychar(){
        List<Config_public_char> config_public_chars = iconfig_public_charDao.queryBychar();
        return config_public_chars;
    };


}

package com.ck.controller;


import com.ck.entity.Config_public_char;
import com.ck.service.Iconfig_public_charService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Config_public_charZengController {
    @Autowired
    private Iconfig_public_charService iconfig_public_charService;
    @RequestMapping("querypublicchar")
    @ResponseBody
    public List<Config_public_char> querypublicchar(){
        List<Config_public_char> chars = iconfig_public_charService.queryBychar();
        return chars;
    }
}

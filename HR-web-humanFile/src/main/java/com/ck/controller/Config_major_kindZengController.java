package com.ck.controller;

import com.ck.entity.Config_major_kind;
import com.ck.service.Iconfig_major_kindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Config_major_kindZengController {
    @Autowired
    private Iconfig_major_kindService iconfig_major_kindService;
    @RequestMapping("querymajorkind")
    @ResponseBody
    public List<Config_major_kind> querymajorkind() {
        List<Config_major_kind> kinds = iconfig_major_kindService.queryBymkf();
        return kinds;
    }
}

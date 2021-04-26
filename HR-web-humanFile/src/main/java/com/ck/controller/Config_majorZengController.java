package com.ck.controller;

import com.ck.entity.Config_major;
import com.ck.service.Iconfig_majorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Config_majorZengController {
    @Autowired
    private Iconfig_majorService iconfig_majorService;
    @RequestMapping("querymajor")
    @ResponseBody
    public List<Config_major> querymajor(int mfk_id){
        List<Config_major> majors = iconfig_majorService.queryBymajorkindid(mfk_id);
        return majors;
    }
}

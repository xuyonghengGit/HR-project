package com.ck.controller;

import com.ck.dao.Iconfig_majorDao;
import com.ck.entity.Config_major;
import com.ck.entity.Config_major_kind;
import com.ck.service.Iconfig_major_kindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RecruitController {

    @Autowired
    private Iconfig_major_kindService iconfig_major_kindService;

    @Autowired
    private Iconfig_majorDao iconfig_majorDao;

    //Config_major_kind：职位分类设置:ajax的根据mfk_id查询
    @RequestMapping("queryBymfk")
    @ResponseBody
    public List<Config_major_kind> queryBymfk(){
        List<Config_major_kind> config_major_kinds = iconfig_major_kindService.queryBymkf();
        return config_major_kinds;
    };

    //根据major_kind_id查询Config_major表
    @RequestMapping("queryBymajorkindid")
    @ResponseBody
    public List<Config_major> queryBymajorkindid(int mfk_id){
        List<Config_major> config_majors = iconfig_majorDao.queryBymajorkindid(mfk_id);
        return config_majors;
    };



}

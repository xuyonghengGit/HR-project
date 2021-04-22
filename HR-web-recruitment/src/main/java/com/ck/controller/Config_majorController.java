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
public class Config_majorController {

    @Autowired
    private Iconfig_majorDao iconfig_majorDao;
    //根据major_kind_id查询Config_major表
    @RequestMapping("queryBymajorkindid")
    @ResponseBody
    public List<Config_major> queryBymajorkindid(int mfk_id){
        List<Config_major> config_majors = iconfig_majorDao.queryBymajorkindid(mfk_id);
        return config_majors;
    };




}

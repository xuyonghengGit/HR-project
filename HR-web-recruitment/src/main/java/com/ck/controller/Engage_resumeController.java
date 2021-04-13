package com.ck.controller;

import com.ck.dao.Iengage_resumeDao;
import com.ck.entity.Engage_resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Engage_resumeController {
    @Autowired
    private Iengage_resumeDao iengage_resumeDao;

    /**
     * 26.Engage_resume：简历管理
     * @param engage_resume
     */
    @RequestMapping("addEngage_resume")
    @ResponseBody
    public String addEngage_resume(Engage_resume engage_resume){
        iengage_resumeDao.addEngage_resume(engage_resume);
        return "/";
    }

}

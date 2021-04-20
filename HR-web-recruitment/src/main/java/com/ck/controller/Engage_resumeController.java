package com.ck.controller;

import com.ck.dao.Iengage_resumeDao;
import com.ck.entity.Engage_resume;
import org.apache.ibatis.annotations.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 张谕盛
 */

@Controller
public class Engage_resumeController {
    @Autowired
    private Iengage_resumeDao iengage_resumeDao;

    /**
     * 26.Engage_resume：简历管理
     * @param engage_resume
     */
    //添加
    @RequestMapping("addEngage_resume")
    public String addEngage_resume(Engage_resume engage_resume){
        iengage_resumeDao.addEngage_resume(engage_resume);
        return "recruit/resume/resume-choose";
    }

    //根据多个条件查询Engage_resume表(简历筛选)
    @RequestMapping("queryByif")
    public String queryByif(@RequestParam Map map, ModelMap modelMap){
        List<Engage_resume> engage_resumes = iengage_resumeDao.queryByif(map);
        modelMap.put("engage_resumes", engage_resumes);
        return "recruit/resume/resume-list";
    }

    //根据res_id查询Engage_resume表数据要到resume-details页面
    @RequestMapping("queryByres_id")
    public String queryByres_id(int res_id,Map map){
        Engage_resume engage_resumes = iengage_resumeDao.queryByres_id(res_id);
        map.put("engage_resume",engage_resumes);
        return "recruit/resume/resume-details";
    }

    //根据res_id查询Engage_resume表数据要到resume-select页面
    @RequestMapping("queryByres_id2")
    public String queryByres_id2(int res_id,Map map){
        Engage_resume engage_resumes = iengage_resumeDao.queryByres_id(res_id);
        map.put("engage_resume",engage_resumes);
        return "recruit/resume/resume-select";
    }

    //复核中进行的修改
    @RequestMapping("updateEngage_resum")
    public String updateEngage_resum(Engage_resume engage_resume){
//        System.out.println(m);
        iengage_resumeDao.updateEngage_resum(engage_resume);
        return "recruit/resume/resume-choose";
    }

    //根据多个条件查询Engage_resume表(有效简历查询)
    @RequestMapping("queryByvalid")
    public String queryByvalid(@RequestParam Map map, ModelMap modelMap){
        List<Engage_resume> engage_resumes = iengage_resumeDao.queryByif(map);
        modelMap.put("engage_resume", engage_resumes);
        System.out.println(map);
        return "recruit/resume/valid-list";
    }
}

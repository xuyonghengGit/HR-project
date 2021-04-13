package com.ck.controller;

import com.ck.entity.Human_file;
import com.ck.service.Ihuman_fileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.faces.annotation.RequestMap;
import java.util.List;
import java.util.Map;

@Controller
public class Human_fileController {
    @Autowired
    private Ihuman_fileService ihuman_fileService;
    //人力资源档案复核前查询
    @RequestMapping("queryreviewer")
    public String queryreviewer(ModelMap modelMap){
        List<Human_file> fileslist = ihuman_fileService.queryreviewer();
        modelMap.put("fileslist",fileslist);
        return "humanResources/check_list";
    }
    @RequestMapping("queryByidreviewer02")
    public String queryreviewer02(ModelMap modelMap,int human_id){
        Human_file queryreviewer02 = ihuman_fileService.queryreviewer02(human_id);
        modelMap.put("fileslist02",queryreviewer02);
        return "humanResources/human_check";
    }

}

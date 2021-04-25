package com.ck.controller;

import com.ck.entity.Human_file;
import com.ck.service.Ihuman_fileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.faces.annotation.RequestMap;
import java.util.Date;
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
    //根据编号查询人力资源表
    @RequestMapping("queryByidreviewer02")
    public String queryByidreviewer02(ModelMap modelMap,int human_id){
        Human_file fileslist02 = ihuman_fileService.queryByidreviewer02(human_id);
        System.out.println(fileslist02);
        modelMap.put("fileslist02",fileslist02);
        return "humanResources/human_check";
    }

    //人力资源档案登记添加
    @RequestMapping("addhuman")
    //Human_file human_file
    public String addhuman(Human_file human_file) {
        //@RequestParam Map map
        int i = ihuman_fileService.querybybianhao();
        human_file.setHuman_id(i+1);
        ihuman_fileService.addIhmanZeng(human_file);
       return "redirect:queryreviewer";
    }
    //人力资源查询
    @RequestMapping("queryhumanlist")
    public String queryhumanlist(ModelMap modelMap,Map map){
        List<Human_file> queryhumanlist = ihuman_fileService.queryhumanlist(map);
        modelMap.put("queryhumanlist",queryhumanlist);
        return "humanResources/query_list";
    }
    //人力资源档案复核
    @RequestMapping("dateIhmanZeng")
    public String dateIhmanZeng(Human_file human_file){

        System.out.println(human_file);
        ihuman_fileService.dateIhmanZeng(human_file);
        return  "redirect:queryreviewer";
    }
}

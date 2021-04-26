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
       return "humanResources/success";
    }
    //人力资源查询
    @RequestMapping("queryhumanlist")
    public String queryhumanlist(ModelMap modelMap,@RequestParam Map map){
        List<Human_file> queryhumanlist = ihuman_fileService.queryhumanlist(map);
        modelMap.put("queryhumanlist",queryhumanlist);
        return "humanResources/query_list";
    }
    //人力资源档案复核
    @RequestMapping("dateIhmanZeng")
    public String dateIhmanZeng(Human_file hfd_id){
        ihuman_fileService.dateIhmanZeng(hfd_id);
        return  "humanResources/success";
    }
    //根据编号查询人力资源表
    @RequestMapping("queryByidreviewer03")
    public String queryByidreviewer03(ModelMap modelMap,int human_id){
        Human_file fileslist02 = ihuman_fileService.queryByidreviewer02(human_id);
        modelMap.put("fileslist02",fileslist02);
        return "humanResources/query_list_information";
    }
    //人力资源查询
    @RequestMapping("queryhumanlist01")
    public String queryhumanlist01(ModelMap modelMap,@RequestParam Map map){
        List<Human_file> queryhumanlist = ihuman_fileService.queryhumanlist01(map);
        modelMap.put("queryhumanlist",queryhumanlist);
        return "humanResources/change_list";
    }
    @RequestMapping("queryByidreviewer04")
    //修改人力资源查询
    public String queryByidreviewer04(ModelMap modelMap,int human_id){
        Human_file fileslist02 = ihuman_fileService.queryByidreviewer02(human_id);
        System.out.println(fileslist02);
        modelMap.put("fileslist02",fileslist02);
        return "humanResources/change_list_information";
    }
    //人力资源档案变更
    @RequestMapping("dateIhmanZengbg")
    public String dateIhmanZengbg(Human_file human_file){
        ihuman_fileService.dateIhmanZeng(human_file);
        return  "humanResources/success";
    }
    @RequestMapping("queryByidreviewer05")
    //删除人力资源查询
    public String queryByidreviewer05(ModelMap modelMap,int human_id){
        Human_file fileslist02 = ihuman_fileService.queryByidreviewer02(human_id);
        System.out.println(fileslist02);
        modelMap.put("fileslist02",fileslist02);
        return "humanResources/delete_list_information";
    }
    //删除人力资源查询
    @RequestMapping("queryhumanlist02")
    public String queryhumanlist02(ModelMap modelMap,@RequestParam Map map){
        List<Human_file> queryhumanlist = ihuman_fileService.queryhumanlist01(map);
        modelMap.put("queryhumanlist",queryhumanlist);
        return "humanResources/delete_list";
    }
    //删除人力资源操作
    @RequestMapping("delHumanfile")
    public String delHumanfile(int hfd_id){
        ihuman_fileService.delHumanfile(hfd_id);
        return "humanResources/success";
    }
    //家删除事件
    @RequestMapping("datajiashanchu")
    public String datajiashanchu(int human_id){
        ihuman_fileService.datajiashanchu(human_id);
        return "humanResources/success";
    }
    //回复已经假删除的人力资源查询
    @RequestMapping("queryhumanlist03")
    public String queryhumanlist03(ModelMap modelMap,@RequestParam Map map){
        List<Human_file> queryhumanlist = ihuman_fileService.queryhumanlist03(map);
        modelMap.put("queryhumanlist",queryhumanlist);
        return "humanResources/recovery_list";
    }
    @RequestMapping("queryByidreviewer06")
    //删除人力资源查询
    public String queryByidreviewer06(ModelMap modelMap,int human_id){
        Human_file fileslist02 = ihuman_fileService.queryByidreviewer02(human_id);
        System.out.println(fileslist02);
        modelMap.put("fileslist02",fileslist02);
        return "humanResources/recovery_list_information";
    }
    @RequestMapping("huifudechongqirensheng")
    //恢复假删除的操作
    public String huifudechongqirensheng(int human_id){
        ihuman_fileService.huifudechongqirensheng(human_id);
        return "humanResources/success";
    }
    @RequestMapping("queryreviewer01")
    public String queryreviewer01(ModelMap modelMap){
        List<Human_file> fileslist = ihuman_fileService.queryreviewer01();
        modelMap.put("fileslist",fileslist);
        return "humanResources/delete_forever_list";
    }
}

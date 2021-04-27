package com.ck.controller;

import com.ck.entity.Rights;
import com.ck.entity.rights_control;
import com.ck.service.IrightsService;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Insert;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class Rightcontroller {
    //自动注入角色业务
    @Autowired
    private IrightsService dao;
    @RequestMapping("queryrightsAll")
    public String queryAll(ModelMap map){
        List<Rights> rights = dao.queryAll();
        map.put("rightsAll",rights);
        return "power/user_list";
    }
    @RequestMapping("queryrightsAllajax")
    @ResponseBody
    public List<Rights> queryAllajax(ModelMap map){
        List<Rights> rights = dao.queryAll();
        map.put("rightsAll",rights);
        return rights;
    }
    @RequestMapping("queryrightsAllpage")
    public String queryAllpage(ModelMap map,@RequestParam(required = false)  Map m){
        //当前页 默认为1
        int pageNum = 1;
        //判断是否为第一次加载
        if (m.get("pageNum")!=null){
            //不是就获取界面数据，是就为默认1
            pageNum = Integer.parseInt(m.get("pageNum")+"");
        }
        //分页查询
        Page<Rights> page = dao.queryBypage(pageNum,6);
        //分页工具实体类
        map.put("page", page);
        return "power/right_list";
    }
    @RequestMapping("queryrightAndcontrol")
    public String queryrightAndcontrol(int id,ModelMap map){
        Rights rights = dao.queryAndcontro(id);
        System.out.println(rights);
        map.put("randc",rights );
        return "power/right_list_information";
    }
    @RequestMapping("controledit")
    public  String controledit(rights_control rc,Rights rights){
        System.out.println(rc);
        System.out.println(rights);
        dao.updaterights(rights, rc);
        return "power/success";
    }
    @RequestMapping("addrights")
    public String addrights(Rights r){
        dao.addrights(r);
        return "power/success";
    }
}

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
        int pageNum = 1;
        if (m.get("pageNum")!=null){
            pageNum = Integer.parseInt(m.get("pageNum")+"");
        }
        Page<Rights> page = dao.queryBypage(pageNum,6);
        List<Rights> result = page.getResult();
        int pages = page.getPages();
        //一页的数据
        map.put("rightspage",result);
        //总页数
        map.put("Pages", pages);
        //当前页数
        map.put("PageNum", pageNum);
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

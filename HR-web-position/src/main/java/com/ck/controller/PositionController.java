package com.ck.controller;

import com.ck.entity.Config_file_first_kind;
import com.ck.service.Iconfig_file_first_kindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 *         制 作 人:唐永海
 *         时 间:4.13做
 *         2.Config_file_first_kind ：一级机构设置
 */
@Controller
public class PositionController {
    //给Iconfig_file_first_kindService表自动赋值
    @Autowired
    private Iconfig_file_first_kindService firstdao;

    //查询一级机构设置表给值
    @RequestMapping("queryOrganization1")
    public String queryAll(ModelMap map) {
        //第一页面   查询所有
        List<Config_file_first_kind> list = firstdao.queryAll();
        //传值转发给页面
        map.addAttribute("Config_file_first_kindlistQueryAll",list);
        //转发到first_kind页面
        return "client/first_kind";
    }

    //根据id查询一级机构设置表
    @RequestMapping("queryByIdOrganization1")
    //int  中id是页面给来的数据
    public String queryById(ModelMap map,int id) {
        //根据id获取查询
        Config_file_first_kind list = firstdao.queryById(id);
        //传值转发给页面
        map.addAttribute("Config_file_first_kindlistQueryByid",list);
        return "client/first_kind_change";
    }

    //根据id修改
    @RequestMapping("updateByIdOrganization1")
    public String updateById(ModelMap map,Config_file_first_kind file) {

        /**
         *   修改可能会报错   将报错给包裹起来将报错输出  方面后续查看
         *   finally  报错也会走入初始页面
         */
        try {
            firstdao.updateById(file);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("修改报错了呢!!!");
        } finally {
            return "redirect:queryOrganization1";
        }
    }

    //根据id做删除
    @RequestMapping("deleteByIdOrganization1")
    public String deleteById(ModelMap map,int id) {
        //根据id做删除!
        firstdao.deleteById(id);
        //删除完后返回原始页面
        return "client/first_delete_success";
    }

    //添加内容
    @RequestMapping("insertsOrganization1")
    public String inserts(ModelMap map,Config_file_first_kind first) {
        //根据id做删除!
        try {
            firstdao.insets(first);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Organization添加数据报错!");
        } finally {
            //添加完后返回原始页面
            return "client/first_kind_register_success";
        }
    }
}

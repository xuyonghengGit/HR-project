package com.ck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class Indexcontroller {
    //主页
    @RequestMapping("/")
    public  String logo(){
        return "login";
        //return "index";
    }
    //页面跳转
    @RequestMapping("topage")
    public String topage(String page){
        return page;
    }
    //页面跳转
    @RequestMapping("mytest")
    public String test(){
        return "Mytest";
    }
}

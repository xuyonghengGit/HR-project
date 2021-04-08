package com.ck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {
    @RequestMapping("test")
    public String query(){
        System.out.println("我是你爹");
        System.out.println("增肌儿子");
        System.out.println("儿子");
        System.out.println("1234565789");
        System.out.println("我是张三");
        return "test";
    }
}

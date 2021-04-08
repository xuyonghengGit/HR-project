package com.ck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {
    @RequestMapping("test")
    public String query(){
        System.out.println("我是你爹");
        return "test";
    }
}

package com.ck.controller;

import com.ck.entity.Config_file_second_kind;
import com.ck.service.Iconfig_file_second_kindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class Config_file_second_kindZengController {
    @Autowired
    private Iconfig_file_second_kindService dao;
    @RequestMapping("querysecondkind")
    @ResponseBody
    public List<Config_file_second_kind> querysecondkind(int first_kind_id){
        List<Config_file_second_kind> kinds = dao.querysecond(first_kind_id);
        return kinds;
    }
}

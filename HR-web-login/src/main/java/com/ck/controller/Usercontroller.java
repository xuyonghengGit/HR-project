package com.ck.controller;

import com.ck.entity.User;
import com.ck.entity.rights_control;
import com.ck.service.Irights_controlService;
import com.ck.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;


import org.springframework.util.DigestUtils;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
//@SessionAttributes({"userLoginSucceed"})
public class Usercontroller {
    //自动注入service
    @Autowired
    private IuserService dao;

    @Autowired
    private Irights_controlService rightscontroldao;
    //自动注入属性文件中的加密盐值
    @Value("${md5_solt}")
    private String md5str;



    @RequestMapping("userlogin")
    @ResponseBody
    public String login(@RequestParam Map map, HttpSession session){
        //把密码添加盐值进行加密
        String pwd = DigestUtils.md5DigestAsHex((map.get("pwd") + md5str).getBytes());
        //把加密结果保存
        map.put("pwd", pwd);
        User login = dao.login(map);
        if (login==null){
            return "notsucceed";
        }else{
            //把用户信息保存到session中
            session.setAttribute("userLoginSucceed",login);
            int id = login.getUser_type();
            rights_control rights_control = rightscontroldao.queryByid(id);
            session.setAttribute("rights",rights_control);
            return "succeed";
        }
    }
    @RequestMapping("quituser")
    public String quituser(HttpSession session){
        session.removeAttribute("userLoginSucceed");
        return "redirect:/";
    }

}

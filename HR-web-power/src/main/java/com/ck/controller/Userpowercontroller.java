package com.ck.controller;

import com.ck.entity.Rights;
import com.ck.entity.User;
import com.ck.service.IrightsService;
import com.ck.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Userpowercontroller {
    //自动获取user业务层
    @Autowired
    private IuserService dao;
    //自动获取角色dao
    @Autowired
    private IrightsService rigdao;
    //获取配置当中的盐值
    @Value("${md5_solt}")
    private String md5str;

    @RequestMapping("queryUserAll")
    public String queryuserAll(ModelMap map){
        //查询所有用户
        List<User> users = dao.queryAll();
        map.put("usersAll", users);

        return "forward:queryrightsAll";
    }
    @RequestMapping("adduser")
    public String adduser(User u){
        //密码加盐值转换成MD5格式
        String md5pwd = DigestUtils.md5DigestAsHex((u.getUser_password() + md5str).getBytes());
        //保存加密密码
        u.setUser_password(md5pwd);
        try {
            dao.adduser(u);
        }catch (Exception e){
            return "";
        }
        //添加正常跳转
        return "power/success";
    }
    //修改用户信息根据id查询
    @RequestMapping("queryuseredit")
    public String queryuseredit(int id,ModelMap map){
        User user = dao.queryuseredit(id);
        List<Rights> rights = rigdao.queryAll();
        map.put("rights",rights);
        map.put("useredit",user);
        return "power/user_edit";
    }
    //修改用户信息
    @RequestMapping("useredit")
    public String useredit(User u,String oldpwd){
        //判断密码是否更新
        if(u.getUser_password().equals("******")){
            //把旧密码保存起来
            u.setUser_password(oldpwd);
        }else{
            //转换MD5
            String md5pwd = DigestUtils.md5DigestAsHex((u.getUser_password() + md5str).getBytes());
            //保存MD5密码
            u.setUser_password(md5pwd);
        }
        try {
            dao.useredit(u);
        }catch (Exception e){
          return "";
        }
        return "power/success";
    }
    //删除用户信息
    @RequestMapping("deluser")
    public String deluserbyid(int id){
        dao.deluser(id);
        return "power/success";
    }
}

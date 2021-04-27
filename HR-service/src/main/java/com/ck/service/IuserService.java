package com.ck.service;

import com.ck.entity.User;
import com.github.pagehelper.Page;

import java.util.List;
import java.util.Map;

public interface IuserService {
    //登录
    public User login(Map map);
    //查询所有用户
    public Page<User> queryAll(int pageNum,int pageSize);
    //添加用户
    public void adduser(User u);
    //根据id查询
    public User queryuseredit(int id);
    //根据id修改
    public void useredit(User u);
    //根据id删除
    public void deluser(int id);

}

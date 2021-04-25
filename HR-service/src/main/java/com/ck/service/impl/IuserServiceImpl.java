package com.ck.service.impl;

import com.ck.dao.IuserDao;
import com.ck.entity.User;
import com.ck.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class IuserServiceImpl implements IuserService {
    //自动注入iuserdao
    @Autowired
    private IuserDao dao;
    @Override
    public User login(Map map) {
        //登录
        return dao.login(map);
    }

    @Override
    public List<User> queryAll() {
        //查询所有
        return dao.queryAll();
    }

    @Override
    public void adduser(User u) {
        //添加用户
        dao.adduser(u);
    }

    @Override
    public User queryuseredit(int id) {
        return dao.queryuseredit(id);
    }

    @Override
    public void useredit(User u) {
        dao.useredit(u);
    }

    @Override
    public void deluser(int id) {
        dao.deluser(id);
    }
}

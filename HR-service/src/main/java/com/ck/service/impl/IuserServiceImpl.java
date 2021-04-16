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
        return dao.login(map);
    }
}

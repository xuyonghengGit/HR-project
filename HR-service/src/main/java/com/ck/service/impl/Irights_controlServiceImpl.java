package com.ck.service.impl;

import com.ck.dao.Irights_controlDao;
import com.ck.entity.rights_control;
import com.ck.service.Irights_controlService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Irights_controlServiceImpl implements Irights_controlService {
    @Autowired
    private Irights_controlDao dao;
    @Override
    public rights_control queryByid(int id) {
        return dao.queryByid(id);
    }
}

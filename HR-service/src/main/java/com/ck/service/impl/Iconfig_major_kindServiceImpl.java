package com.ck.service.impl;

import com.ck.dao.Iconfig_major_kindDao;
import com.ck.entity.Config_major_kind;
import com.ck.service.Iconfig_major_kindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Iconfig_major_kindServiceImpl implements Iconfig_major_kindService {
@Autowired
private Iconfig_major_kindDao iconfig_major_kindDao;

    //Config_major_kind：职位分类设置:ajax的根据mfk_id查询

    @Override
    public List<Config_major_kind> queryBymkf() {
        return iconfig_major_kindDao.queryBymfk();
    }

    //根据id做删除
    @Override
    public void deleteById(int id) {
        iconfig_major_kindDao.deleteById(id);
    }

    @Override
    public void insert(Config_major_kind major_kind) {
        iconfig_major_kindDao.insert(major_kind);
    }
}

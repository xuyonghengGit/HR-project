package com.ck.service.impl;

import com.ck.dao.Iconfig_file_first_kindDao;
import com.ck.entity.Config_file_first_kind;
import com.ck.service.Iconfig_file_first_kindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *     //一级结构表
 */

@Service
public class Iconfig_file_first_kindServiceImpl implements Iconfig_file_first_kindService {

    @Autowired
    private Iconfig_file_first_kindDao kindDao;

    @Override
    ////查询所有数据
    public List<Config_file_first_kind> queryAll() {
        return kindDao.queryAll();
    }
    //根据id查询
    @Override
    public Config_file_first_kind queryById(int id) {
        return kindDao.queryById(id);
    }
    //根据id修改
    @Override
    public void updateById(Config_file_first_kind file) {
        kindDao.updateById(file);
    }
    //根据id删除
    @Override
    public void deleteById(int id) {
        kindDao.deleteById(id);
    }
    //添加数据  完全添加
    @Override
    public void insets(Config_file_first_kind first) {
        kindDao.insets(first);
    }
}

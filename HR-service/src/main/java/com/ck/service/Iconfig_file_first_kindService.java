package com.ck.service;

import com.ck.entity.Config_file_first_kind;

import java.util.List;

/**
 *     //一级结构表
 */

public interface Iconfig_file_first_kindService {
    //查询所有数据
    public List<Config_file_first_kind> queryAll();
    //根据id查询
    public Config_file_first_kind queryById(int id);
    //根据id修改
    public void updateById(Config_file_first_kind file);
    //根据id删除
    public void deleteById(int id);
    //添加数据  完全添加
    public void insets(Config_file_first_kind first);
}

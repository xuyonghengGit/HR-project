package com.ck.service;

import com.ck.entity.Config_major_kind;

import java.util.List;


public interface Iconfig_major_kindService {

    //Config_major_kind：职位分类设置:ajax
    public List<Config_major_kind> queryBymkf();

    //根据id做删除
    public void deleteById(int id);

    //完全添加
    public void insert(Config_major_kind major_kind);
}

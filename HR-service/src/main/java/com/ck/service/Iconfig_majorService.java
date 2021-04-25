package com.ck.service;

import com.ck.entity.Config_major;

import java.util.List;

public interface Iconfig_majorService {

    //根据major_kind_id查询Config_major表
    public List<Config_major> queryBymajorkindid(int mfk_id);

    //查询所有
    public List<Config_major> queryAll();

    //根据id做删除
    public void deleteById(int id);

    //添加
    public void insert(Config_major config_major);
}

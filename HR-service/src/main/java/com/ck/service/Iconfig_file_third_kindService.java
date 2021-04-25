package com.ck.service;

import com.ck.entity.Config_file_third_kind;

import java.util.List;

public interface Iconfig_file_third_kindService {
    //根据二级机构编号查询三级机构
    public List<Config_file_third_kind> querythird(int second_kind_id);
    //查询所有数据
    public List<Config_file_third_kind> queryConfig_file_third_kind();
    //根据id做查询
    public Config_file_third_kind queryByidConfig_file_third_kind(int id);
    //根据实体类做修改
    public void updateConfig_file_third_kind(Config_file_third_kind file);
    //根据id做删除
    public void deleteById(int id);
    //添加 根据实体类添加
    public void inse(Config_file_third_kind kind);
}

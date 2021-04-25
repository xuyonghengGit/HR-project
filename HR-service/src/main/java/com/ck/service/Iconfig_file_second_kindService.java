package com.ck.service;

import com.ck.entity.Config_file_second_kind;

import java.util.List;

public interface Iconfig_file_second_kindService {
    //根据编号查询二级机构中的数据
    public List<Config_file_second_kind> querysecond(int first_kind_id);
    //查询二级机构中所有数据
    public List<Config_file_second_kind> queryAllConfig_file_second_kind();
    //修改二级机构表中数据  传类 根据id修改
    public void updateById(Config_file_second_kind second);
    //根据id查询表  id是唯一!!!!!!!!
    public Config_file_second_kind queryByidConfig_file_second_kind(int fsk_id);
    //根据id做删除
    public void deleteById(int id);
    //完全添加
    public void insertConfig_file_second_kind(Config_file_second_kind second);
}

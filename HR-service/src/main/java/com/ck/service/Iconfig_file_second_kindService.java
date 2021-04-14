package com.ck.service;

import com.ck.entity.Config_file_second_kind;

import java.util.List;

public interface Iconfig_file_second_kindService {
    //根据编号查询二级机构中的数据
    public List<Config_file_second_kind> querysecond(int first_kind_id);
    //查询二级机构中所有数据
    public List<Config_file_second_kind> queryAllConfig_file_second_kind();
}

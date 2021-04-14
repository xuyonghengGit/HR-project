package com.ck.service;

import com.ck.entity.Config_file_third_kind;

import java.util.List;

public interface Iconfig_file_third_kindService {
    //根据二级机构编号查询三级机构
    public List<Config_file_third_kind> querythird(int second_kind_id);
}

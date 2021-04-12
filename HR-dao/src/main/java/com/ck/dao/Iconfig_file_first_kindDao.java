package com.ck.dao;

import com.ck.entity.Config_file_first_kind;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Iconfig_file_first_kindDao {
    //查询Iconfig_file_first_kind 一级机构设置中所有数据
    @Select("SELECT * FROM Config_file_first_kind")
    public List<Config_file_first_kind> queryAll();
}
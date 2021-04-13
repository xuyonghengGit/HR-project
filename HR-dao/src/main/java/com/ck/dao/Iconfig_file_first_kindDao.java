package com.ck.dao;

import com.ck.entity.Config_file_first_kind;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Iconfig_file_first_kindDao {
    //查询Iconfig_file_first_kind 一级机构设置中所有数据
    @Select("SELECT * FROM Config_file_first_kind")
    @Results({
            @Result(column = "ffk_id",property = "ffk_id"),
            @Result(column = "first_kind_id",property = "first_kind_id"),
            @Result(column = "first_kind_name",property = "first_kind_name"),
            @Result(column = "first_kind_salary_id",property = "first_kind_salary_id"),
            @Result(column = "first_kind_sale_id",property = "first_kind_sale_id")
    })
    public List<Config_file_first_kind> queryAll();
}
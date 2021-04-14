package com.ck.dao;

import com.ck.entity.Config_file_third_kind;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Iconfig_file_third_kindDao {
    //根据二级机构编号查询三级机构
    @Select("SELECT * FROM Config_file_third_kind where second_kind_id = #{second_kind_id}")
    @Results({
            @Result(column = "ftk_id",property = "ftk_id"),
            @Result(column = "first_kind_id",property = "first_kind_id"),
            @Result(column = "first_kind_name",property = "first_kind_name"),
            @Result(column = "second_kind_id",property = "second_kind_id"),
            @Result(column = "second_kind_name",property = "second_kind_name"),
            @Result(column = "third_kind_id",property = "third_kind_id"),
            @Result(column = "third_kind_name",property = "third_kind_name"),
            @Result(column = "third_kind_sale_id",property = "third_kind_sale_id"),
            @Result(column = "third_kind_is_retail",property = "third_kind_is_retail")
    })
    public List<Config_file_third_kind> querythird(int second_kind_id);
}

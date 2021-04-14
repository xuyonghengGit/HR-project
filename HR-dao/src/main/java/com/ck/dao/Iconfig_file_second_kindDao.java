package com.ck.dao;



import com.ck.entity.Config_file_second_kind;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Iconfig_file_second_kindDao {
    //根据编号查询二级机构中的数据
    @Select("SELECT * FROM Config_file_second_kind where first_kind_id = #{first_kind_id}")
    @Results({
            @Result(column = "fsk_id",property = "fsk_id"),
            @Result(column = "first_kind_id",property = "first_kind_id"),
            @Result(column = "first_kind_name",property = "first_kind_name"),
            @Result(column = "second_kind_id",property = "second_kind_id"),
            @Result(column = "second_kind_name",property = "second_kind_name"),
            @Result(column = "second_salary_id",property = "second_salary_id"),
            @Result(column = "second_sale_id",property = "second_sale_id")
    })
    public List<Config_file_second_kind> querysecond(int first_kind_id);

    //查询表所有二级机构
    @Select("SELECT * FROM Config_file_second_kind")
    public List<Config_file_second_kind> queryAllConfig_file_second_kind();
}

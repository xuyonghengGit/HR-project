package com.ck.dao;



import com.ck.entity.Config_file_first_kind;
import com.ck.entity.Config_file_second_kind;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface Iconfig_file_second_kindDao {
    //根据一级编号查询二级机构中的数据
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

    //根据编号查询二级机构中的数据
    @Select("SELECT * FROM Config_file_second_kind where fsk_id = #{fsk_id}")
    @Results({
            @Result(column = "fsk_id",property = "fsk_id"),
            @Result(column = "first_kind_id",property = "first_kind_id"),
            @Result(column = "first_kind_name",property = "first_kind_name"),
            @Result(column = "second_kind_id",property = "second_kind_id"),
            @Result(column = "second_kind_name",property = "second_kind_name"),
            @Result(column = "second_salary_id",property = "second_salary_id"),
            @Result(column = "second_sale_id",property = "second_sale_id")
    })
    public Config_file_second_kind queryByidConfig_file_second_kind(int fsk_id);

    //查询表所有二级机构
    @Select("SELECT * FROM Config_file_second_kind")
    public List<Config_file_second_kind> queryAllConfig_file_second_kind();

    //根据id修改  传值是实体类  没有返回值  报错交给控制器中try解决
    @Update("UPDATE `Config_file_second_kind` SET `first_kind_id`=#{first_kind_id},`first_kind_name`=#{first_kind_name},`second_kind_id`=#{second_kind_id},`second_kind_name`=#{second_kind_name},`second_salary_id`=#{second_salary_id},`second_sale_id`=#{second_sale_id} WHERE `fsk_id`= #{fsk_id}")
    public void updateById(Config_file_second_kind second);

    //根据id做删除
    @Delete("DELETE FROM Config_file_second_kind WHERE fsk_id =#{id}")
    public void deleteById(int id);

//    //完全添加
    @Insert("INSERT INTO Config_file_second_kind VALUES(#{fsk_id},#{first_kind_id},#{first_kind_name},#{second_kind_id},#{second_kind_name},#{second_salary_id},#{second_sale_id})")
    public void insertConfig_file_second_kind(Config_file_second_kind second);
}

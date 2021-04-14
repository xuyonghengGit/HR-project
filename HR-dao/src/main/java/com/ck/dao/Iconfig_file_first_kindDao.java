package com.ck.dao;

import com.ck.entity.Config_file_first_kind;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface Iconfig_file_first_kindDao {
    //查询Iconfig_file_first_kind 一级机构设置中所有数据  映射给Results
    @Select("SELECT * FROM Config_file_first_kind")
    @Results({
            @Result(column = "ffk_id",property = "ffk_id"),
            @Result(column = "first_kind_id",property = "first_kind_id"),
            @Result(column = "first_kind_name",property = "first_kind_name"),
            @Result(column = "first_kind_salary_id",property = "first_kind_salary_id"),
            @Result(column = "first_kind_sale_id",property = "first_kind_sale_id")
    })
    public List<Config_file_first_kind> queryAll();

    //根据id查询   映射给Results
    @Select("SELECT * FROM Config_file_first_kind where ffk_id = #{id}")
    @Results({
            @Result(column = "ffk_id",property = "ffk_id"),
            @Result(column = "first_kind_id",property = "first_kind_id"),
            @Result(column = "first_kind_name",property = "first_kind_name"),
            @Result(column = "first_kind_salary_id",property = "first_kind_salary_id"),
            @Result(column = "first_kind_sale_id",property = "first_kind_sale_id")
    })
    public Config_file_first_kind queryById(int id);

    //根据id修改  传值是实体类  没有返回值  报错交给控制器中try解决
    @Update("UPDATE Config_file_first_kind SET first_kind_id= #{first_kind_id},first_kind_name=#{first_kind_name},first_kind_salary_id=#{first_kind_salary_id},first_kind_sale_id=#{first_kind_sale_id} WHERE ffk_id=#{ffk_id}")
    public void updateById(Config_file_first_kind file);

    //根据id做删除!
    @Delete("DELETE FROM Config_file_first_kind WHERE ffk_id =#{id}")
    public void deleteById(int id);

    //添加内容
    @Insert("INSERT INTO Config_file_first_kind VALUES(#{ffk_id},#{first_kind_id},#{first_kind_name},#{first_kind_salary_id},#{first_kind_sale_id})")
    public void insets(Config_file_first_kind first);
}
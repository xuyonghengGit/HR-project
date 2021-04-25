package com.ck.dao;

import com.ck.entity.Config_file_third_kind;
import org.apache.ibatis.annotations.*;

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

    //查询所有数据
    @Select("SELECT * FROM Config_file_third_kind")
    public List<Config_file_third_kind> queryConfig_file_third_kind();

    //根据id做查询
    @Select("SELECT * FROM Config_file_third_kind where ftk_id = #{id}")
    public Config_file_third_kind queryByidConfig_file_third_kind(int id);

    //根据实体类做修改
    @Update("UPDATE `Config_file_third_kind` SET `first_kind_id`=#{first_kind_id},`first_kind_name`=#{first_kind_name},`second_kind_id`=#{second_kind_id},`second_kind_name`=#{second_kind_name},second_kind_name = #{second_kind_name},third_kind_id=#{third_kind_id},`third_kind_sale_id`=#{third_kind_sale_id},`third_kind_is_retail`=#{third_kind_is_retail} WHERE `ftk_id`= #{ftk_id}")
    public void updateConfig_file_third_kind(Config_file_third_kind file);

    //根据id做删除
    @Delete("DELETE FROM Config_file_third_kind WHERE ftk_id =#{ftk_id}")
    public void deleteById(int id);

    //添加 根据实体类添加
    @Insert("INSERT INTO Config_file_third_kind VALUES(0,#{first_kind_id},#{first_kind_name},#{second_kind_id},#{second_kind_name},#{third_kind_id},#{third_kind_name},#{third_kind_sale_id},#{third_kind_is_retail});")
    public void inse(Config_file_third_kind kind);
}

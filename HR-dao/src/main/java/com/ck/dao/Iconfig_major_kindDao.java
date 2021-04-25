package com.ck.dao;

import com.ck.entity.Config_file_second_kind;
import com.ck.entity.Config_major_kind;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//9.Config_major_kind：职位分类设置
public interface Iconfig_major_kindDao {
    //Config_major_kind：职位分类设置:ajax
    @Select("select * from Config_major_kind")
    public List<Config_major_kind> queryBymfk();

    //根据id做删除
    @Delete("DELETE FROM Config_major_kind WHERE mfk_id =#{mfk_id}")
    public void deleteById(int id);

    //    //完全添加
    @Insert("INSERT INTO Config_major_kind VALUES(0,#{major_kind_id},#{major_kind_name})")
    public void insert(Config_major_kind major_kind);
}
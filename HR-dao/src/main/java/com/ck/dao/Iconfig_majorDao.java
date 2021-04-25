package com.ck.dao;

import com.ck.entity.Config_major;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//Config_major：职位设置
public interface Iconfig_majorDao {

    //根据major_kind_id查询Config_major表
    @Select("SELECT * FROM Config_major WHERE major_kind_id = #{mfk_id};")
    public List<Config_major> queryBymajorkindid(int mfk_id);

    //查询所有
    @Select("SELECT * FROM Config_major")
    public List<Config_major> queryAll();

    //根据id做删除
    @Delete("DELETE FROM Config_major WHERE mak_id =#{mak_id}")
    public void deleteById(int id);

    //添加
    @Insert("INSERT INTO Config_major VALUES(0,#{major_kind_id},#{major_kind_name},#{major_id},#{major_name},#{test_amount});")
    public void insert(Config_major config_major);
}

package com.ck.dao;

import com.ck.entity.Config_major;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//Config_major：职位设置
public interface Iconfig_majorDao {

    //根据major_kind_id查询Config_major表
    @Select("SELECT * FROM Config_major WHERE major_kind_id = #{mfk_id};")
    public List<Config_major> queryBymajorkindid(int mfk_id);
}

package com.ck.dao;

import com.ck.entity.Config_major_kind;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//9.Config_major_kind：职位分类设置
public interface Iconfig_major_kindDao {
    //Config_major_kind：职位分类设置:ajax
    @Select("select * from Config_major_kind")
    public List<Config_major_kind> queryBymfk();
}

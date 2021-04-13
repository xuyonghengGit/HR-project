package com.ck.dao;

import com.ck.entity.Config_public_char;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//7.Config_public_char：公共字段设置
public interface Iconfig_public_charDao {

    //查询Config_public_char所有
    @Select("select * from Config_public_char")
    public List<Config_public_char> queryBychar();
}

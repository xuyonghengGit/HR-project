package com.ck.dao;


import com.ck.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * 登录查询
 */
public interface IuserDao {
    @Select("SELECT * FROM User WHERE user_name = #{user} AND user_password = #{pwd}")
    public User login(Map map);
}

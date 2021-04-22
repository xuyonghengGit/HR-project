package com.ck.dao;


import com.ck.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * 登录查询
 */
public interface IuserDao {
    //登录
    @Select("SELECT * FROM User WHERE user_name = #{user} AND user_password = #{pwd}")
    public User login(Map map);

    //查询所有
    @Select("SELECT * FROM User")
    public List<User> queryAll();

    //添加用户
    @Insert("INSERT INTO `User` VALUES(NULL,#{user_name},#{user_true_name},#{user_password},#{user_type})")
    public void adduser(User u);

    //根据id查询用户
    @Select("select * from User where user_id = #{id}")
    public User queryuseredit(int id);

    //根据id修改用户信息
    @Update("UPDATE `User` SET user_name = #{user_name},user_true_name = #{user_true_name},user_password = #{user_password},user_type = #{user_type} WHERE user_id = #{user_id}")
    public void useredit(User u);

    //根据id删除
    @Delete("delete from User where user_id = #{id}")
    public void deluser(int id);
}

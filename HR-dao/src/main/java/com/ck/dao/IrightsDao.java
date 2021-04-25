package com.ck.dao;

import com.ck.entity.Rights;
import org.apache.ibatis.annotations.*;

import javax.faces.annotation.RequestMap;
import java.util.List;

/**
 * 角色管理
 */
public interface IrightsDao {
    //查询所有可用角色
    @Select("select * from rights where r_type = '1'")
    public List<Rights> queryAll();

    //查询所有角色
    @Select("select * from rights")
    public List<Rights> queryrightsAll();

    //根据id查询角色并且联查权限
    @Select("select * from rights where r_id = #{id}")
    @Result(one = @One(select = "com.ck.dao.Irights_controlDao.queryByid"),column = "r_id",property = "rc")
    public Rights queryAndcontro(int id);

    //修改角色与权限一个事务
    @Update("UPDATE rights SET r_name = #{r_name},r_explain = #{r_explain},r_type = #{r_type} WHERE r_id = #{r_id}")
    public void updaterights(Rights r);

    //添加角色并且添加权限
    @Insert("INSERT INTO rights VALUES(NULL,#{r_name},#{r_explain},#{r_type})")
    @SelectKey(statement = "select last_insert_id()",before = false,keyProperty = "r_id",keyColumn = "r_id",resultType = int.class)
    public void addrights(Rights r);
}

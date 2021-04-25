package com.ck.dao;

import com.ck.entity.Config_public_char;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//7.Config_public_char：公共字段设置
public interface Iconfig_public_charDao {

    //查询Config_public_char所有
    @Select("select * from Config_public_char  order by attribute_kind asc")
    public List<Config_public_char> queryBychar();

    //删除Config_public_char  根据id做删除
    @Delete("DELETE FROM Config_public_char WHERE pbc_id =#{id}")
    public void dle(int id);

    //添加
    @Insert("INSERT INTO Config_public_char VALUES(0,#{attribute_kind},#{attribute_name})")
    public void insertT(Config_public_char config);

    //查寻职称  职称对应的种类是2
    @Select("select * from Config_public_char where attribute_kind = #{attribute_kind}")
    public List<Config_public_char> queryByID2(int id);
}

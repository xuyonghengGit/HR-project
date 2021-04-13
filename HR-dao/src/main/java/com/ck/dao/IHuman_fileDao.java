package com.ck.dao;

import com.ck.entity.Config_public_char;
import com.ck.entity.Human_file;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import javax.faces.annotation.RequestMap;
import java.util.List;

public interface IHuman_fileDao {
    //人力资源档案登记复核前查询
    @Select("SELECT * FROM HumanFile")
    @ResultMap("reviewerquery")
    public List<Human_file> queryreviewer();

    //人力资源档案登记复核查询
    @Select("SELECT * FROM HumanFile where human_id = #{human_id}")
    @ResultMap("reviewerquery02")
    public Human_file queryreviewer02(int human_id);


}

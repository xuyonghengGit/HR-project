package com.ck.dao;

import com.ck.entity.Human_file;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import javax.faces.annotation.RequestMap;
import java.util.List;

public interface IHuman_fileDao {
    @Select("SELECT * FROM HumanFile")
    @ResultMap("reviewerquery")
    //人力资源档案登记复核前查询
    public List<Human_file> queryreviewer();
}

package com.ck.dao;

import com.ck.entity.Mytest;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItestDao {
    @Select("SELECT * FROM mytest")
    public List<Mytest> QueryAllIndexTest();


}

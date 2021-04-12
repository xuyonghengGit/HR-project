package com.ck.dao;
/**
 * 刘伟
 */
import com.ck.entity.Major_Change;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IMajor_changeDao {
    //查询Major_change表
    @Select("SELECT * FROM Major_change")
    public List<Major_Change> queryAlltransferMajor_change();

}

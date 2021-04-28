package com.ck.dao;

/**
 * 刘伟
 *薪酬标准单详细信息
 */

import com.ck.entity.Salary_standard_details;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ISalary_standard_detailsDao {
    //查询Salary_standard_details表
    @Select("SELECT * FROM Salary_standard_details")
    public List<Salary_standard_details> querySalary_standard_details();
    //根据sdt_id查询Salary_standard_details表
    @Select("SELECT * FROM Salary_standard_details where sdt_id= #{sdt_id}")
    public Salary_standard_details querySalary_standard_detailsBySdt_id(int sdt_id);
}

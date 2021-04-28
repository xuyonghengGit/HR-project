package com.ck.service;
/**
 * 刘伟
 *薪酬标准单详细信息
 */
import com.ck.entity.Salary_standard_details;


import java.util.List;

public interface ISalary_standard_detailsService {
    //查询Salary_standard_details表
    public List<Salary_standard_details> querySalary_standard_details();
    //根据sdt_id查询Salary_standard_details表
    public Salary_standard_details querySalary_standard_detailsBySdt_id(int sdt_id);
}

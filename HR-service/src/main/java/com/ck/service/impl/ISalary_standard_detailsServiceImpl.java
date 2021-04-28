package com.ck.service.impl;
/**
 * 刘伟
 *薪酬标准单详细信息
 */
import com.ck.dao.ISalary_standard_detailsDao;
import com.ck.entity.Salary_standard_details;
import com.ck.service.ISalary_standard_detailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ISalary_standard_detailsServiceImpl implements ISalary_standard_detailsService {
    @Autowired
    private ISalary_standard_detailsDao iSalary_standard_detailsDao;
    //查询Salary_standard_details表
    @Override
    public List<Salary_standard_details> querySalary_standard_details() {
        return iSalary_standard_detailsDao.querySalary_standard_details();
    }
    //根据sdt_id查询Salary_standard_details表
    @Override
    public Salary_standard_details querySalary_standard_detailsBySdt_id(int sdt_id) {
        return iSalary_standard_detailsDao.querySalary_standard_detailsBySdt_id(sdt_id);
    }
}

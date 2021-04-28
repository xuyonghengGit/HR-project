package com.ck.controller;

import com.ck.entity.Config_major_kind;
import com.ck.entity.Salary_standard_details;
import com.ck.service.ISalary_standard_detailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SalaryController {
    @Autowired
    private ISalary_standard_detailsService iSalary_standard_detailsService;
    //Salary_standard_details：薪资分类设置:ajax查询
    @RequestMapping("querySalary")
    @ResponseBody
    public List<Salary_standard_details> querySalary(){
        List<Salary_standard_details> listSalary = iSalary_standard_detailsService.querySalary_standard_details();
        return listSalary;
    };
    //Salary_standard_details：薪资分类设置:ajax查询 根据sdt_id
    @RequestMapping("querySalary_standard_detailsBySdt_id")
    @ResponseBody
    public Salary_standard_details querySalary_standard_detailsBySdt_id(int sdt_id){
        Salary_standard_details Salary = iSalary_standard_detailsService.querySalary_standard_detailsBySdt_id(sdt_id);
        return Salary;
    };
}

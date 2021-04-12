package com.ck.entity;

import java.util.Date;

/**
 *18.Salary_grant： 薪酬发放登记表
 */
public class Salary_grant {
    private int sgr_id;
    private int salary_grant_id;
    private int salary_standard_id;
    private int first_kind_id;
    private String first_kind_name;
    private int second_kind_id;
    private String second_kind_name;
    private int third_kind_id;
    private String third_kind_name;
    private double salary_standard_sum;
    private double salary_paid_sum;
    private String register;
    private Date regist_time;
    private String checker;
    private Date check_time;
    private int check_status;



    public int getSgr_id() {
        return sgr_id;
    }

    public void setSgr_id(int sgr_id) {
        this.sgr_id = sgr_id;
    }

    public int getSalary_grant_id() {
        return salary_grant_id;
    }

    public void setSalary_grant_id(int salary_grant_id) {
        this.salary_grant_id = salary_grant_id;
    }

    public int getSalary_standard_id() {
        return salary_standard_id;
    }

    public void setSalary_standard_id(int salary_standard_id) {
        this.salary_standard_id = salary_standard_id;
    }

    public int getFirst_kind_id() {
        return first_kind_id;
    }

    public void setFirst_kind_id(int first_kind_id) {
        this.first_kind_id = first_kind_id;
    }

    public String getFirst_kind_name() {
        return first_kind_name;
    }

    public void setFirst_kind_name(String first_kind_name) {
        this.first_kind_name = first_kind_name;
    }

    public int getSecond_kind_id() {
        return second_kind_id;
    }

    public void setSecond_kind_id(int second_kind_id) {
        this.second_kind_id = second_kind_id;
    }

    public String getSecond_kind_name() {
        return second_kind_name;
    }

    public void setSecond_kind_name(String second_kind_name) {
        this.second_kind_name = second_kind_name;
    }

    public int getThird_kind_id() {
        return third_kind_id;
    }

    public void setThird_kind_id(int third_kind_id) {
        this.third_kind_id = third_kind_id;
    }

    public String getThird_kind_name() {
        return third_kind_name;
    }

    public void setThird_kind_name(String third_kind_name) {
        this.third_kind_name = third_kind_name;
    }

    public double getSalary_standard_sum() {
        return salary_standard_sum;
    }

    public void setSalary_standard_sum(double salary_standard_sum) {
        this.salary_standard_sum = salary_standard_sum;
    }

    public double getSalary_paid_sum() {
        return salary_paid_sum;
    }

    public void setSalary_paid_sum(double salary_paid_sum) {
        this.salary_paid_sum = salary_paid_sum;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public Date getRegist_time() {
        return regist_time;
    }

    public void setRegist_time(Date regist_time) {
        this.regist_time = regist_time;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public Date getCheck_time() {
        return check_time;
    }

    public void setCheck_time(Date check_time) {
        this.check_time = check_time;
    }

    public int getCheck_status() {
        return check_status;
    }

    public void setCheck_status(int check_status) {
        this.check_status = check_status;
    }

    public Salary_grant() {
    }

    public Salary_grant(int sgr_id, int salary_grant_id, int salary_standard_id, int first_kind_id, String first_kind_name, int second_kind_id, String second_kind_name, int third_kind_id, String third_kind_name, double salary_standard_sum, double salary_paid_sum, String register, Date regist_time, String checker, Date check_time, int check_status) {
        this.sgr_id = sgr_id;
        this.salary_grant_id = salary_grant_id;
        this.salary_standard_id = salary_standard_id;
        this.first_kind_id = first_kind_id;
        this.first_kind_name = first_kind_name;
        this.second_kind_id = second_kind_id;
        this.second_kind_name = second_kind_name;
        this.third_kind_id = third_kind_id;
        this.third_kind_name = third_kind_name;
        this.salary_standard_sum = salary_standard_sum;
        this.salary_paid_sum = salary_paid_sum;
        this.register = register;
        this.regist_time = regist_time;
        this.checker = checker;
        this.check_time = check_time;
        this.check_status = check_status;
    }

    @Override
    public String toString() {
        return "Salary_grant{" +
                "sgr_id=" + sgr_id +
                ", salary_grant_id=" + salary_grant_id +
                ", salary_standard_id=" + salary_standard_id +
                ", first_kind_id=" + first_kind_id +
                ", first_kind_name='" + first_kind_name + '\'' +
                ", second_kind_id=" + second_kind_id +
                ", second_kind_name='" + second_kind_name + '\'' +
                ", third_kind_id=" + third_kind_id +
                ", third_kind_name='" + third_kind_name + '\'' +
                ", salary_standard_sum=" + salary_standard_sum +
                ", salary_paid_sum=" + salary_paid_sum +
                ", register='" + register + '\'' +
                ", regist_time=" + regist_time +
                ", checker='" + checker + '\'' +
                ", check_time=" + check_time +
                ", check_status=" + check_status +
                '}';
    }
}

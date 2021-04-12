package com.ck.entity;

/**
 *   唐永海
 *   17.Major_change：职位调动表
 */
public class Major_Change {
    private int mch_id;
    private int first_kind_id;
    private String first_kind_name;
    private int second_kind_id;
    private String second_kind_name;
    private int third_kind_id;
    private String third_kind_name;
    private int major_kind_id;
    private String major_kind_name;
    private int major_id;
    private String major_name;
    private int new_first_kind_id;
    private String new_first_kind_name;
    private int new_second_kind_id;
    private String new_second_kind_name;
    private int new_third_kind_id;
    private String new_third_kind_name;
    private int new_major_kind_id;
    private String new_major_kind_name;
    private int new_major_id;
    private String new_major_name;
    private int human_id;
    private String human_name;
    private int salary_standard_id;
    private String salary_standard_name;
    private double salary_sum;
    private int new_salary_standard_id;
    private String new_salary_standard_name;
    private double new_salary_sum;
    private String change_reason;
    private String check_reason;
    private int check_status;
    private String register;
    private String checker;
    private String regist_time;
    private String check_time;

    public Major_Change() {
    }

    public Major_Change(int mch_id, int first_kind_id, String first_kind_name, int second_kind_id, String second_kind_name, int third_kind_id, String third_kind_name, int major_kind_id, String major_kind_name, int major_id, String major_name, int new_first_kind_id, String new_first_kind_name, int new_second_kind_id, String new_second_kind_name, int new_third_kind_id, String new_third_kind_name, int new_major_kind_id, String new_major_kind_name, int new_major_id, String new_major_name, int human_id, String human_name, int salary_standard_id, String salary_standard_name, double salary_sum, int new_salary_standard_id, String new_salary_standard_name, double new_salary_sum, String change_reason, String check_reason, int check_status, String register, String checker, String regist_time, String check_time) {
        this.mch_id = mch_id;
        this.first_kind_id = first_kind_id;
        this.first_kind_name = first_kind_name;
        this.second_kind_id = second_kind_id;
        this.second_kind_name = second_kind_name;
        this.third_kind_id = third_kind_id;
        this.third_kind_name = third_kind_name;
        this.major_kind_id = major_kind_id;
        this.major_kind_name = major_kind_name;
        this.major_id = major_id;
        this.major_name = major_name;
        this.new_first_kind_id = new_first_kind_id;
        this.new_first_kind_name = new_first_kind_name;
        this.new_second_kind_id = new_second_kind_id;
        this.new_second_kind_name = new_second_kind_name;
        this.new_third_kind_id = new_third_kind_id;
        this.new_third_kind_name = new_third_kind_name;
        this.new_major_kind_id = new_major_kind_id;
        this.new_major_kind_name = new_major_kind_name;
        this.new_major_id = new_major_id;
        this.new_major_name = new_major_name;
        this.human_id = human_id;
        this.human_name = human_name;
        this.salary_standard_id = salary_standard_id;
        this.salary_standard_name = salary_standard_name;
        this.salary_sum = salary_sum;
        this.new_salary_standard_id = new_salary_standard_id;
        this.new_salary_standard_name = new_salary_standard_name;
        this.new_salary_sum = new_salary_sum;
        this.change_reason = change_reason;
        this.check_reason = check_reason;
        this.check_status = check_status;
        this.register = register;
        this.checker = checker;
        this.regist_time = regist_time;
        this.check_time = check_time;
    }

    public int getMch_id() {
        return mch_id;
    }

    public void setMch_id(int mch_id) {
        this.mch_id = mch_id;
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

    public int getMajor_kind_id() {
        return major_kind_id;
    }

    public void setMajor_kind_id(int major_kind_id) {
        this.major_kind_id = major_kind_id;
    }

    public String getMajor_kind_name() {
        return major_kind_name;
    }

    public void setMajor_kind_name(String major_kind_name) {
        this.major_kind_name = major_kind_name;
    }

    public int getMajor_id() {
        return major_id;
    }

    public void setMajor_id(int major_id) {
        this.major_id = major_id;
    }

    public String getMajor_name() {
        return major_name;
    }

    public void setMajor_name(String major_name) {
        this.major_name = major_name;
    }

    public int getNew_first_kind_id() {
        return new_first_kind_id;
    }

    public void setNew_first_kind_id(int new_first_kind_id) {
        this.new_first_kind_id = new_first_kind_id;
    }

    public String getNew_first_kind_name() {
        return new_first_kind_name;
    }

    public void setNew_first_kind_name(String new_first_kind_name) {
        this.new_first_kind_name = new_first_kind_name;
    }

    public int getNew_second_kind_id() {
        return new_second_kind_id;
    }

    public void setNew_second_kind_id(int new_second_kind_id) {
        this.new_second_kind_id = new_second_kind_id;
    }

    public String getNew_second_kind_name() {
        return new_second_kind_name;
    }

    public void setNew_second_kind_name(String new_second_kind_name) {
        this.new_second_kind_name = new_second_kind_name;
    }

    public int getNew_third_kind_id() {
        return new_third_kind_id;
    }

    public void setNew_third_kind_id(int new_third_kind_id) {
        this.new_third_kind_id = new_third_kind_id;
    }

    public String getNew_third_kind_name() {
        return new_third_kind_name;
    }

    public void setNew_third_kind_name(String new_third_kind_name) {
        this.new_third_kind_name = new_third_kind_name;
    }

    public int getNew_major_kind_id() {
        return new_major_kind_id;
    }

    public void setNew_major_kind_id(int new_major_kind_id) {
        this.new_major_kind_id = new_major_kind_id;
    }

    public String getNew_major_kind_name() {
        return new_major_kind_name;
    }

    public void setNew_major_kind_name(String new_major_kind_name) {
        this.new_major_kind_name = new_major_kind_name;
    }

    public int getNew_major_id() {
        return new_major_id;
    }

    public void setNew_major_id(int new_major_id) {
        this.new_major_id = new_major_id;
    }

    public String getNew_major_name() {
        return new_major_name;
    }

    public void setNew_major_name(String new_major_name) {
        this.new_major_name = new_major_name;
    }

    public int getHuman_id() {
        return human_id;
    }

    public void setHuman_id(int human_id) {
        this.human_id = human_id;
    }

    public String getHuman_name() {
        return human_name;
    }

    public void setHuman_name(String human_name) {
        this.human_name = human_name;
    }

    public int getSalary_standard_id() {
        return salary_standard_id;
    }

    public void setSalary_standard_id(int salary_standard_id) {
        this.salary_standard_id = salary_standard_id;
    }

    public String getSalary_standard_name() {
        return salary_standard_name;
    }

    public void setSalary_standard_name(String salary_standard_name) {
        this.salary_standard_name = salary_standard_name;
    }

    public double getSalary_sum() {
        return salary_sum;
    }

    public void setSalary_sum(double salary_sum) {
        this.salary_sum = salary_sum;
    }

    public int getNew_salary_standard_id() {
        return new_salary_standard_id;
    }

    public void setNew_salary_standard_id(int new_salary_standard_id) {
        this.new_salary_standard_id = new_salary_standard_id;
    }

    public String getNew_salary_standard_name() {
        return new_salary_standard_name;
    }

    public void setNew_salary_standard_name(String new_salary_standard_name) {
        this.new_salary_standard_name = new_salary_standard_name;
    }

    public double getNew_salary_sum() {
        return new_salary_sum;
    }

    public void setNew_salary_sum(double new_salary_sum) {
        this.new_salary_sum = new_salary_sum;
    }

    public String getChange_reason() {
        return change_reason;
    }

    public void setChange_reason(String change_reason) {
        this.change_reason = change_reason;
    }

    public String getCheck_reason() {
        return check_reason;
    }

    public void setCheck_reason(String check_reason) {
        this.check_reason = check_reason;
    }

    public int getCheck_status() {
        return check_status;
    }

    public void setCheck_status(int check_status) {
        this.check_status = check_status;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public String getRegist_time() {
        return regist_time;
    }

    public void setRegist_time(String regist_time) {
        this.regist_time = regist_time;
    }

    public String getCheck_time() {
        return check_time;
    }

    public void setCheck_time(String check_time) {
        this.check_time = check_time;
    }
}

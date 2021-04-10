package com.ck.entity;

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
}

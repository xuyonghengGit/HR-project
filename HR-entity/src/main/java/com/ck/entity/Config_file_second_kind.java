package com.ck.entity;

/**
 * 刘伟
 * 3.二级机构设置
 */
public class Config_file_second_kind {
    private int fsk_id;
    private int first_kind_id;
    private String first_kind_name;
    private int second_kind_id;
    private String second_kind_name;
    private int second_salary_id;
    private int second_sale_id;

    public Config_file_second_kind() {
    }

    public Config_file_second_kind(int fsk_id, int first_kind_id, String first_kind_name, int second_kind_id, String second_kind_name, int second_salary_id, int second_sale_id) {
        this.fsk_id = fsk_id;
        this.first_kind_id = first_kind_id;
        this.first_kind_name = first_kind_name;
        this.second_kind_id = second_kind_id;
        this.second_kind_name = second_kind_name;
        this.second_salary_id = second_salary_id;
        this.second_sale_id = second_sale_id;
    }

    public int getFsk_id() {
        return fsk_id;
    }

    public void setFsk_id(int fsk_id) {
        this.fsk_id = fsk_id;
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

    public int getSecond_salary_id() {
        return second_salary_id;
    }

    public void setSecond_salary_id(int second_salary_id) {
        this.second_salary_id = second_salary_id;
    }

    public int getSecond_sale_id() {
        return second_sale_id;
    }

    public void setSecond_sale_id(int second_sale_id) {
        this.second_sale_id = second_sale_id;
    }

    @Override
    public String toString() {
        return "Config_file_second_kind{" +
                "fsk_id=" + fsk_id +
                ", first_kind_id=" + first_kind_id +
                ", first_kind_name='" + first_kind_name + '\'' +
                ", second_kind_id=" + second_kind_id +
                ", second_kind_name='" + second_kind_name + '\'' +
                ", second_salary_id=" + second_salary_id +
                ", second_sale_id=" + second_sale_id +
                '}';
    }
}

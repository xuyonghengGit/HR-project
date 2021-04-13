package com.ck.entity;

/**
 * 刘伟
 * 4.三级机构设置
 */
public class Config_file_third_kind {
    private int ftk_id;
    private int first_kind_id;
    private String first_kind_name;
    private int second_kind_id;
    private String second_kind_name;
    private int third_kind_id;
    private String third_kind_name;
    private int third_kind_sale_id;
    private int third_kind_is_retail;

    public Config_file_third_kind() {
    }

    public Config_file_third_kind(int ftk_id, int first_kind_id, String first_kind_name, int second_kind_id, String second_kind_name, int third_kind_id, String third_kind_name, int third_kind_sale_id, int third_kind_is_retail) {
        this.ftk_id = ftk_id;
        this.first_kind_id = first_kind_id;
        this.first_kind_name = first_kind_name;
        this.second_kind_id = second_kind_id;
        this.second_kind_name = second_kind_name;
        this.third_kind_id = third_kind_id;
        this.third_kind_name = third_kind_name;
        this.third_kind_sale_id = third_kind_sale_id;
        this.third_kind_is_retail = third_kind_is_retail;
    }

    public int getFtk_id() {
        return ftk_id;
    }

    public void setFtk_id(int ftk_id) {
        this.ftk_id = ftk_id;
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

    public int getThird_kind_sale_id() {
        return third_kind_sale_id;
    }

    public void setThird_kind_sale_id(int third_kind_sale_id) {
        this.third_kind_sale_id = third_kind_sale_id;
    }

    public int getThird_kind_is_retail() {
        return third_kind_is_retail;
    }

    public void setThird_kind_is_retail(int third_kind_is_retail) {
        this.third_kind_is_retail = third_kind_is_retail;
    }

    @Override
    public String toString() {
        return "Config_file_third_kind{" +
                "ftk_id=" + ftk_id +
                ", first_kind_id=" + first_kind_id +
                ", first_kind_name='" + first_kind_name + '\'' +
                ", second_kind_id=" + second_kind_id +
                ", second_kind_name='" + second_kind_name + '\'' +
                ", third_kind_id=" + third_kind_id +
                ", third_kind_name='" + third_kind_name + '\'' +
                ", third_kind_sale_id=" + third_kind_sale_id +
                ", third_kind_is_retail=" + third_kind_is_retail +
                '}';
    }
}

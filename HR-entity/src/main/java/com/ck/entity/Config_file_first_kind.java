package com.ck.entity;

/**
 *      唐永海
 * //   2.Config_file_first_kind ：一级机构设置
 *
 */
public class Config_file_first_kind {
    private int ffk_id;
    private int first_kind_id;
    private String first_kind_name;
    private int first_kind_salary_id;
    private int first_kind_sale_id;

    public Config_file_first_kind() {
    }

    public Config_file_first_kind(int ffk_id, int first_kind_id, String first_kind_name, int first_kind_salary_id, int first_kind_sale_id) {
        this.ffk_id = ffk_id;
        this.first_kind_id = first_kind_id;
        this.first_kind_name = first_kind_name;
        this.first_kind_salary_id = first_kind_salary_id;
        this.first_kind_sale_id = first_kind_sale_id;
    }

    @Override
    public String toString() {
        return "Config_file_first_kind{" +
                "ffk_id=" + ffk_id +
                ", first_kind_id=" + first_kind_id +
                ", first_kind_name='" + first_kind_name + '\'' +
                ", first_kind_salary_id=" + first_kind_salary_id +
                ", first_kind_sale_id=" + first_kind_sale_id +
                '}';
    }

    public int getFfk_id() {
        return ffk_id;
    }

    public void setFfk_id(int ffk_id) {
        this.ffk_id = ffk_id;
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

    public int getFirst_kind_salary_id() {
        return first_kind_salary_id;
    }

    public void setFirst_kind_salary_id(int first_kind_salary_id) {
        this.first_kind_salary_id = first_kind_salary_id;
    }

    public int getFirst_kind_sale_id() {
        return first_kind_sale_id;
    }

    public void setFirst_kind_sale_id(int first_kind_sale_id) {
        this.first_kind_sale_id = first_kind_sale_id;
    }
}

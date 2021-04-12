package com.ck.entity;

public class Config_major_kind {
    //9.Config_major_kind：职位分类设置
    private int mfk_id;
    private int major_kind_id;
    private String major_kind_name;

    public int getMfk_id() {
        return mfk_id;
    }

    public void setMfk_id(int mfk_id) {
        this.mfk_id = mfk_id;
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
}

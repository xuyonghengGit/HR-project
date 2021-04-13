package com.ck.entity;

/**
 * 刘伟
 * 7.公共字段设置
 */
public class Config_public_char {
    private int pbc_id;
    private String attribute_kind;
    private String attribute_name;

    public Config_public_char() {
    }

    public Config_public_char(int pbc_id, String attribute_kind, String attribute_name) {
        this.pbc_id = pbc_id;
        this.attribute_kind = attribute_kind;
        this.attribute_name = attribute_name;
    }

    public int getPbc_id() {
        return pbc_id;
    }

    public void setPbc_id(int pbc_id) {
        this.pbc_id = pbc_id;
    }

    public String getAttribute_kind() {
        return attribute_kind;
    }

    public void setAttribute_kind(String attribute_kind) {
        this.attribute_kind = attribute_kind;
    }

    public String getAttribute_name() {
        return attribute_name;
    }

    public void setAttribute_name(String attribute_name) {
        this.attribute_name = attribute_name;
    }

    @Override
    public String toString() {
        return "Config_public_char{" +
                "pbc_id=" + pbc_id +
                ", attribute_kind='" + attribute_kind + '\'' +
                ", attribute_name='" + attribute_name + '\'' +
                '}';
    }
}

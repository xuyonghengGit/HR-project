package com.ck.entity;

/**
 * 角色管理
 */
public class Rights {
    private int r_id;
    private String r_name;
    private String r_explain;
    private int r_type;
    private  rights_control rc;

    public Rights() {
    }

    public Rights(int r_id, String r_name, String r_explain, int r_type, rights_control rc) {
        this.r_id = r_id;
        this.r_name = r_name;
        this.r_explain = r_explain;
        this.r_type = r_type;
        this.rc = rc;
    }

    @Override
    public String toString() {
        return "Rights{" +
                "r_id=" + r_id +
                ", r_name='" + r_name + '\'' +
                ", r_explain='" + r_explain + '\'' +
                ", r_type=" + r_type +
                ", rc=" + rc +
                '}';
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public String getR_explain() {
        return r_explain;
    }

    public void setR_explain(String r_explain) {
        this.r_explain = r_explain;
    }

    public int getR_type() {
        return r_type;
    }

    public void setR_type(int r_type) {
        this.r_type = r_type;
    }

    public rights_control getRc() {
        return rc;
    }

    public void setRc(rights_control rc) {
        this.rc = rc;
    }
}

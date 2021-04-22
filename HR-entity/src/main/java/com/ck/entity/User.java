package com.ck.entity;

/**
 * 刘伟
 * 1.用户表
 */
public class User {
    private int user_id;
    private String user_name;
    private String user_true_name;
    private String user_password;
    private int user_type;

    public User() {
    }

    public User(int user_id, String user_name, String user_true_name, String user_password, int user_type) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_true_name = user_true_name;
        this.user_password = user_password;
        this.user_type = user_type;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_true_name='" + user_true_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_type=" + user_type +
                '}';
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_true_name() {
        return user_true_name;
    }

    public void setUser_true_name(String user_true_name) {
        this.user_true_name = user_true_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }
}

package com.ck.entity;

/**
 * @author xuyh
 * @version 1.0
 * 测试实体类
 */
public class Mytest {
    private int id;
    private String name;

    public Mytest() {
    }

    public Mytest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mytest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

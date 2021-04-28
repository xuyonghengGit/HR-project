package com.ck.entity;

public class Salary_standard_details {
    private int sdt_id;
    private int standard_id;
    private String standard_name;
    private int item_id;
    private String item_name;
    private double salary;

    public Salary_standard_details() {
    }

    public Salary_standard_details(int sdt_id, int standard_id, String standard_name, int item_id, String item_name, double salary) {
        this.sdt_id = sdt_id;
        this.standard_id = standard_id;
        this.standard_name = standard_name;
        this.item_id = item_id;
        this.item_name = item_name;
        this.salary = salary;
    }

    public int getSdt_id() {
        return sdt_id;
    }

    public void setSdt_id(int sdt_id) {
        this.sdt_id = sdt_id;
    }

    public int getStandard_id() {
        return standard_id;
    }

    public void setStandard_id(int standard_id) {
        this.standard_id = standard_id;
    }

    public String getStandard_name() {
        return standard_name;
    }

    public void setStandard_name(String standard_name) {
        this.standard_name = standard_name;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary_standard_details{" +
                "sdt_id=" + sdt_id +
                ", standard_id=" + standard_id +
                ", standard_name='" + standard_name + '\'' +
                ", item_id=" + item_id +
                ", item_name='" + item_name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

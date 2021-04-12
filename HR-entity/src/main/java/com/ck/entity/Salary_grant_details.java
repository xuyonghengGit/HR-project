package com.ck.entity;

/**
 * 19.Salary_grant_details:薪酬发放详细信息
 */
public class Salary_grant_details {
    private int grd_id;
    private int salary_grant_id;
    private int human_id;
    private String human_name;
    private double bouns_sum;
    private double sale_sum;
    private double deduct_sum;
    private double salary_standard_sum;
    private double salary_paid_sum;

    public int getGrd_id() {
        return grd_id;
    }

    public void setGrd_id(int grd_id) {
        this.grd_id = grd_id;
    }

    public int getSalary_grant_id() {
        return salary_grant_id;
    }

    public void setSalary_grant_id(int salary_grant_id) {
        this.salary_grant_id = salary_grant_id;
    }

    public int getHuman_id() {
        return human_id;
    }

    public void setHuman_id(int human_id) {
        this.human_id = human_id;
    }

    public String getHuman_name() {
        return human_name;
    }

    public void setHuman_name(String human_name) {
        this.human_name = human_name;
    }

    public double getBouns_sum() {
        return bouns_sum;
    }

    public void setBouns_sum(double bouns_sum) {
        this.bouns_sum = bouns_sum;
    }

    public double getSale_sum() {
        return sale_sum;
    }

    public void setSale_sum(double sale_sum) {
        this.sale_sum = sale_sum;
    }

    public double getDeduct_sum() {
        return deduct_sum;
    }

    public void setDeduct_sum(double deduct_sum) {
        this.deduct_sum = deduct_sum;
    }

    public double getSalary_standard_sum() {
        return salary_standard_sum;
    }

    public void setSalary_standard_sum(double salary_standard_sum) {
        this.salary_standard_sum = salary_standard_sum;
    }

    public double getSalary_paid_sum() {
        return salary_paid_sum;
    }

    public void setSalary_paid_sum(double salary_paid_sum) {
        this.salary_paid_sum = salary_paid_sum;
    }

    public Salary_grant_details() {
    }

    public Salary_grant_details(int grd_id, int salary_grant_id, int human_id, String human_name, double bouns_sum, double sale_sum, double deduct_sum, double salary_standard_sum, double salary_paid_sum) {
        this.grd_id = grd_id;
        this.salary_grant_id = salary_grant_id;
        this.human_id = human_id;
        this.human_name = human_name;
        this.bouns_sum = bouns_sum;
        this.sale_sum = sale_sum;
        this.deduct_sum = deduct_sum;
        this.salary_standard_sum = salary_standard_sum;
        this.salary_paid_sum = salary_paid_sum;
    }

    @Override
    public String toString() {
        return "Salary_grant_details{" +
                "grd_id=" + grd_id +
                ", salary_grant_id=" + salary_grant_id +
                ", human_id=" + human_id +
                ", human_name='" + human_name + '\'' +
                ", bouns_sum=" + bouns_sum +
                ", sale_sum=" + sale_sum +
                ", deduct_sum=" + deduct_sum +
                ", salary_standard_sum=" + salary_standard_sum +
                ", salary_paid_sum=" + salary_paid_sum +
                '}';
    }
}

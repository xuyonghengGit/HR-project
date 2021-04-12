package com.ck.entity;

public class Engage_interview {
    //Engage_interview：面试表
    private int ein_id;
    private String human_name;
    private int interview_amount;
    private int human_major_kind_id;
    private String human_major_kind_name;
    private int human_major_id;
    private String human_major_name;
    private int image_degree;
    private int native_language_degree;
    private int foreign_language_degree;
    private int response_speed_degree;
    private int EQ_degree;
    private int IQ_degree;
    private String multi_quality_degree;
    private String register;
    private String checker;
    private String registe_time;
    private String check_time;
    private int resume_id;
    private String result;
    private String interview_comment;
    private String check_comment;
    private int interview_status;
    private int check_status;

    public int getEin_id() {
        return ein_id;
    }

    public void setEin_id(int ein_id) {
        this.ein_id = ein_id;
    }

    public String getHuman_name() {
        return human_name;
    }

    public void setHuman_name(String human_name) {
        this.human_name = human_name;
    }

    public int getInterview_amount() {
        return interview_amount;
    }

    public void setInterview_amount(int interview_amount) {
        this.interview_amount = interview_amount;
    }

    public int getHuman_major_kind_id() {
        return human_major_kind_id;
    }

    public void setHuman_major_kind_id(int human_major_kind_id) {
        this.human_major_kind_id = human_major_kind_id;
    }

    public String getHuman_major_kind_name() {
        return human_major_kind_name;
    }

    public void setHuman_major_kind_name(String human_major_kind_name) {
        this.human_major_kind_name = human_major_kind_name;
    }

    public int getHuman_major_id() {
        return human_major_id;
    }

    public void setHuman_major_id(int human_major_id) {
        this.human_major_id = human_major_id;
    }

    public String getHuman_major_name() {
        return human_major_name;
    }

    public void setHuman_major_name(String human_major_name) {
        this.human_major_name = human_major_name;
    }

    public int getImage_degree() {
        return image_degree;
    }

    public void setImage_degree(int image_degree) {
        this.image_degree = image_degree;
    }

    public int getNative_language_degree() {
        return native_language_degree;
    }

    public void setNative_language_degree(int native_language_degree) {
        this.native_language_degree = native_language_degree;
    }

    public int getForeign_language_degree() {
        return foreign_language_degree;
    }

    public void setForeign_language_degree(int foreign_language_degree) {
        this.foreign_language_degree = foreign_language_degree;
    }

    public int getResponse_speed_degree() {
        return response_speed_degree;
    }

    public void setResponse_speed_degree(int response_speed_degree) {
        this.response_speed_degree = response_speed_degree;
    }

    public int getEQ_degree() {
        return EQ_degree;
    }

    public void setEQ_degree(int EQ_degree) {
        this.EQ_degree = EQ_degree;
    }

    public int getIQ_degree() {
        return IQ_degree;
    }

    public void setIQ_degree(int IQ_degree) {
        this.IQ_degree = IQ_degree;
    }

    public String getMulti_quality_degree() {
        return multi_quality_degree;
    }

    public void setMulti_quality_degree(String multi_quality_degree) {
        this.multi_quality_degree = multi_quality_degree;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public String getRegiste_time() {
        return registe_time;
    }

    public void setRegiste_time(String registe_time) {
        this.registe_time = registe_time;
    }

    public String getCheck_time() {
        return check_time;
    }

    public void setCheck_time(String check_time) {
        this.check_time = check_time;
    }

    public int getResume_id() {
        return resume_id;
    }

    public void setResume_id(int resume_id) {
        this.resume_id = resume_id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getInterview_comment() {
        return interview_comment;
    }

    public void setInterview_comment(String interview_comment) {
        this.interview_comment = interview_comment;
    }

    public String getCheck_comment() {
        return check_comment;
    }

    public void setCheck_comment(String check_comment) {
        this.check_comment = check_comment;
    }

    public int getInterview_status() {
        return interview_status;
    }

    public void setInterview_status(int interview_status) {
        this.interview_status = interview_status;
    }

    public int getCheck_status() {
        return check_status;
    }

    public void setCheck_status(int check_status) {
        this.check_status = check_status;
    }

    @Override
    public String toString() {
        return "Engage_interview{" +
                "ein_id=" + ein_id +
                ", human_name='" + human_name + '\'' +
                ", interview_amount=" + interview_amount +
                ", human_major_kind_id=" + human_major_kind_id +
                ", human_major_kind_name='" + human_major_kind_name + '\'' +
                ", human_major_id=" + human_major_id +
                ", human_major_name='" + human_major_name + '\'' +
                ", image_degree=" + image_degree +
                ", native_language_degree=" + native_language_degree +
                ", foreign_language_degree=" + foreign_language_degree +
                ", response_speed_degree=" + response_speed_degree +
                ", EQ_degree=" + EQ_degree +
                ", IQ_degree=" + IQ_degree +
                ", multi_quality_degree='" + multi_quality_degree + '\'' +
                ", register='" + register + '\'' +
                ", checker='" + checker + '\'' +
                ", registe_time='" + registe_time + '\'' +
                ", check_time='" + check_time + '\'' +
                ", resume_id=" + resume_id +
                ", result='" + result + '\'' +
                ", interview_comment='" + interview_comment + '\'' +
                ", check_comment='" + check_comment + '\'' +
                ", interview_status=" + interview_status +
                ", check_status=" + check_status +
                '}';
    }
}

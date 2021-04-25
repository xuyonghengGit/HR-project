package com.ck.dao;

import com.ck.entity.Engage_resume;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface Iengage_resumeDao {
    //添加Engage_resume表数据
    @Insert("INSERT INTO Engage_resume VALUES(\n" +
            "0,#{human_name},#{engage_type},#{human_address},#{human_postcode},#{human_major_kind_id},#{human_major_kind_name},#{human_major_id},#{human_major_name},#{human_telephone},\n" +
            "#{human_homephone},#{human_mobilephone},#{human_email},#{human_hobby},#{human_specility},#{human_sex},\n" +
            "#{human_religion},#{human_party},#{human_nationality},#{human_race},#{human_birthday},#{human_age},#{human_educated_degree},#{human_educated_years},#{human_educated_major},\n" +
            "#{human_college},#{human_idcard},#{human_birthplace},#{demand_salary_standard},#{human_history_records},#{remark},'无',\n" +
            "'1.jpg','1',1,'王五',#{regist_time},'李四','2021-03-05',1,80,1,'离奇',\n" +
            "'2021-03-15','王五','2021-03-15','赵六','2021-03-15',0,'无','无');")
    public void addEngage_resume(Engage_resume engage_resume);

    //根据多个条件查询Engage_resume表
    public List<Engage_resume> queryByif(Map map);

    //根据多个条件查询Engage_resume表
    public List<Engage_resume> queryByvalid(Map map);

    //根据id查询Engage_resume表
    @Select("select * from Engage_resume where res_id = #{res_id}")
    public Engage_resume queryByres_id(int res_id);

    //复核进行修改数据
    @Update("UPDATE Engage_resume SET human_name =#{human_name},human_email=#{human_email},human_telephone = #{human_telephone},human_homephone =#{human_homephone},\n" +
            "human_mobilephone =#{human_mobilephone},human_address =#{human_address},human_postcode = #{human_postcode},human_nationality =#{human_nationality},human_birthplace =#{human_birthplace},\n" +
            "human_birthday =#{human_birthday},human_religion =#{human_religion},human_party = #{human_party},human_idcard =#{human_idcard},human_age = #{human_age},human_college =#{human_college},\n" +
            "human_educated_degree =#{human_educated_degree},human_educated_years =#{human_educated_years},human_educated_major =#{human_educated_major},demand_salary_standard =#{demand_salary_standard},\n" +
            "regist_time =#{regist_time},human_specility = #{human_specility},human_hobby =#{human_hobby},pass_checker =#{pass_checker},pass_check_time =#{pass_check_time},human_history_records =#{human_history_records},\n" +
            "remark =#{remark},recomandation =#{recomandation},pass_check_status = 1 WHERE res_id = #{res_id};")
    public void updateEngage_resum(Engage_resume engage_resume);

}

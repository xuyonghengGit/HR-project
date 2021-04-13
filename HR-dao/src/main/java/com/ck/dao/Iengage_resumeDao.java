package com.ck.dao;

import com.ck.entity.Engage_resume;
import org.apache.ibatis.annotations.Insert;

public interface Iengage_resumeDao {
    //添加Engage_resume表数据
    @Insert("INSERT INTO Engage_resume VALUES(\n" +
            "0,#{human_name},#{engage_type},#{human_address},#{human_postcode},#{human_major_kind_id},#{human_major_kind_name},#{human_major_id},#{human_major_name},#{human_telephone},\n" +
            "#{human_homephone},#{human_mobilephone},#{human_email},#{human_hobby},#{human_specility},#{human_sex},\n" +
            "#{human_religion},#{human_party},#{human_nationality},#{human_race},#{human_birthday},#{human_age},#{human_educated_degree},#{human_educated_years},#{human_educated_major},\n" +
            "#{human_college},#{human_idcard},#{human_birthplace},#{demand_salary_standard},#{human_history_records},#{remark},'无',\n" +
            "'1.jpg','1',1,'王五',#{regist_time},'李四','2021-03-05',1,80,1,'离奇',\n" +
            "'2021-03-15','王五','2021-03-15','赵六','2021-03-15',1,'无','无');")
    public void addEngage_resume(Engage_resume engage_resume);
}

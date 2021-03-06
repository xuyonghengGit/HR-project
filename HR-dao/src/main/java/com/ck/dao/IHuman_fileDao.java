package com.ck.dao;

import com.ck.entity.Config_public_char;
import com.ck.entity.Human_file;
import com.ck.entity.Rights;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.*;

import javax.faces.annotation.RequestMap;
import java.util.List;
import java.util.Map;

public interface IHuman_fileDao {
    //人力资源档案登记复核前查询
    @Select("SELECT * FROM HumanFile")
    @ResultMap("queryreviewer")
    public Page<Rights> queryreviewer();

    //人力资源档案登记复核查询
    @Select("SELECT * FROM HumanFile where human_id = #{human_id}")
    @ResultMap("queryByidreviewer02")
    public Human_file queryByidreviewer02(int human_id);

    //人力资源档案登记添加#{attachment_name}  #{human_picture}
    @Insert("INSERT INTO HumanFile VALUES(\n" +
            "\tNULL,#{human_id},#{first_kind_id},#{first_kind_name},#{second_kind_id},\n" +
            "#{second_kind_name},#{third_kind_id},#{third_kind_name},#{human_name},#{human_address},\n" +
            "\t#{human_postcode},#{human_pro_designation},#{human_major_kind_id},#{human_major_kind_name},#{human_major_id},\n" +
            "\t#{hunma_major_name},#{human_telephone},#{human_mobilephone},#{human_bank},#{human_account},\n" +
            "\t#{human_qq},#{human_email},#{human_hobby},#{human_speciality},#{human_sex},\n" +
            "\t#{human_religion},#{human_party},#{human_nationality},#{human_race},#{human_birthday},\n" +
            "\t#{human_birthplace},#{human_age},#{human_educated_degree},#{human_educated_years},#{human_educated_major},\n" +
            "\t#{human_society_security_id},#{human_id_card},#{remark},'0',#{salary_standard_name},\n" +
            "\t'0','0','0','0','0',\n" +
            "\t'0','0',#{human_histroy_records},#{human_family_membership},#{human_picture},\n" +
            "\t'','2',#{register},'','',\n" +
            "\t#{regist_time},NULL,NULL,NULL,NULL,\n" +
            "\tNULL,'1')")
    @SelectKey(statement = "select last_insert_id()",before = false,keyProperty = "hfd_id",keyColumn = "hfd_id",resultType = int.class)
    public void addIhmanZeng(Human_file human_file);
    //人力资源档案多条件查询状态值等于一
    public List<Human_file> queryhumanlist(Map map);
    //编号查询
    @Select("SELECT MAX(human_id) FROM HumanFile")
    public int querybybianhao();
    //人力资源档案复核
    @Update("UPDATE HumanFile SET human_pro_designation=#{human_pro_designation},human_name = #{human_name},human_sex=#{human_sex},\n" +
            "human_email=#{human_email},human_telephone=#{human_telephone},human_qq=#{human_qq},human_mobilephone=#{human_mobilephone},\n" +
            "human_birthplace=#{human_birthplace},human_postcode=#{human_postcode},human_nationality=#{human_nationality},human_birthplace=#{human_birthplace},human_birthday=#{human_birthday},\n" +
            "human_race=#{human_race},human_religion=#{human_religion},human_party=#{human_party},human_id_card=#{human_id_card},human_society_security_id=#{human_society_security_id},\n" +
            "human_age=#{human_age},human_educated_degree=#{human_educated_degree},human_educated_years=#{human_educated_years},human_educated_major=#{human_educated_major},salary_standard_name=#{salary_standard_name},\n" +
            "human_bank=#{human_bank},human_account=#{human_account},checker=#{checker},check_time=#{check_time},human_speciality=#{human_speciality},human_hobby=#{human_hobby},\n" +
            "human_histroy_records=#{human_histroy_records},human_family_membership=#{human_family_membership},remark=#{remark},human_file_status='2' WHERE human_id = #{human_id}")
    public void dateIhmanZeng(Human_file human_file);
    //人力资源档案变更
    @Update("UPDATE HumanFile SET human_pro_designation=#{human_pro_designation},human_name = #{human_name},human_sex=#{human_sex},\n" +
            "human_email=#{human_email},human_telephone=#{human_telephone},human_qq=#{human_qq},human_mobilephone=#{human_mobilephone},\n" +
            "human_birthplace=#{human_birthplace},human_postcode=#{human_postcode},human_nationality=#{human_nationality},human_birthplace=#{human_birthplace},human_birthday=#{human_birthday},\n" +
            "human_race=#{human_race},human_religion=#{human_religion},human_party=#{human_party},human_id_card=#{human_id_card},human_society_security_id=#{human_society_security_id},\n" +
            "human_age=#{human_age},human_educated_degree=#{human_educated_degree},human_educated_years=#{human_educated_years},human_educated_major=#{human_educated_major},salary_standard_name=#{salary_standard_name},\n" +
            "human_bank=#{human_bank},human_account=#{human_account},changer=#{changer},change_time=#{change_time},human_speciality=#{human_speciality},human_hobby=#{human_hobby},\n" +
            "human_histroy_records=#{human_histroy_records},human_family_membership=#{human_family_membership},remark=#{remark},human_file_status='2' WHERE human_id = #{human_id}")
    public void dateIhmanZengbg(Human_file human_file);
    //强制删除操作
    @Delete("DELETE FROM HumanFile WHERE hfd_id = #{hfd_id}")
    public int delHumanfile(int hfd_id);
    //删除操作
    @Update("UPDATE HumanFile SET human_file_status =3 WHERE human_id = #{human_id}")
    public int datajiashanchu(int human_id);
    //人力资源档案多条件查询状态值等于二
    public List<Human_file> queryhumanlist01(Map map);
    //人力资源档案多条件查询状态值等于3
    public List<Human_file> queryhumanlist03(Map map);
    //回复假删除的操作
    @Update("UPDATE HumanFile SET human_file_status =2 WHERE human_id = #{human_id}")
    public int huifudechongqirensheng(int human_id);
    //已经假山除的查询
    @Select("SELECT * FROM HumanFile where human_file_status = 3")
    @ResultMap("queryByidreviewer02")
    public List<Human_file> queryreviewer01();
    //附件上传
    @Update("UPDATE HumanFile SET attachment_name = #{attachment_name}  WHERE hfd_id = #{hfd_id}")
    public void datefujianshangchuan(Map m);
}

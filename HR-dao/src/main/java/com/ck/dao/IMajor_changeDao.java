package com.ck.dao;
/**
 * 刘伟
 */
import com.ck.entity.Engage_resume;
import com.ck.entity.Human_file;
import com.ck.entity.Major_Change;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface IMajor_changeDao {
    //1.调动登记
    //多条件查询人力资源档案（一级，二级，三级机构，档案登记时间，档案状态）
    //IMajor_changeDaoMapper.xml
    public List<Human_file> queryConditiontransferHuman_file(Map map);

    //根据hfd_id查询人力资源档案
    @Select("select * from HumanFile where hfd_id =#{hfd_id}")
    public Human_file queryByHfd_idtransferHuman_file(int hfd_id);

    //添加Major_change表数据
    @Insert("insert into Major_change values (null,#{first_kind_id},#{first_kind_name},#{second_kind_id},#{second_kind_name},#{third_kind_id},#{third_kind_name}," +
            "#{major_kind_id},#{major_kind_name},#{major_id},#{major_name}," +
            "#{new_first_kind_id},#{new_first_kind_name},#{new_second_kind_id},#{new_second_kind_name},#{new_third_kind_id},#{new_third_kind_name}," +
            "#{new_major_kind_id},#{new_major_kind_name},#{new_major_id},#{new_major_name}," +
            "#{human_id},#{human_name},#{salary_standard_id},#{salary_standard_name},#{salary_sum},#{new_salary_standard_id},#{new_salary_standard_name},#{new_salary_sum}," +
            "#{change_reason},null,0,#{register},null,#{regist_time},null)")
    public void addTransferMajor_change(Major_Change major_change);
    //修改HumanFile表数据
    @Update("update HumanFile set human_file_status =1 where human_id =#{s} ")
    public void updateTransferHumanFiletatus(int s);

    //2.审核
    //查询Major_change表 （未通过）
    @Select("select * from Major_change where check_status =0")
    public List<Major_Change> queryBycheck_statusTFMajor_change();

    //根据mch_id查询Major_change表-（审核）
    @Select("SELECT * FROM Major_change where mch_id =#{mch_id}")
    public Major_Change queryBymch_idtransferMajor_change(int mch_id);

    //修改Major_change表数据
    @Update("update Major_change set check_reason= #{check_reason},check_status =#{check_status}," +
            "checker=#{checker},check_time =#{check_time} where mch_id =#{mch_id};")
    public void updateTransferMajor_change(Map map);

    //修改HumanFile表数据
    @Update("update HumanFile set  first_kind_id= #{new_first_kind_id},first_kind_name =#{new_first_kind_name}, second_kind_id=#{new_second_kind_id},second_kind_name=#{new_second_kind_name}, third_kind_id=#{new_third_kind_id},third_kind_name=#{new_third_kind_name}," +
            " human_major_kind_id=#{new_major_kind_id},human_major_kind_name=#{new_major_kind_name}, human_major_id=#{new_major_id},hunma_major_name=#{new_major_name}, salary_standard_name=#{new_salary_standard_name},salary_sum=#{new_salary_sum}," +
            " check_status=1, register=#{register}, checker=#{checker}, changer=#{checker}," +
            " regist_time=#{regist_time}, check_time=#{check_time}, change_time=#{check_time}, lastly_change_time=#{check_time}," +
            " human_file_status=2 where human_id =#{human_id}")
    public void updateTransferHumanFile(Map map);


    //3.调动查询
    //多条件查询Major_change表（一级，二级，三级机构，职位分类，职位，档案登记时间，档案状态）
    //IMajor_changeDaoMapper.xml
    public List<Major_Change> queryConditiontransferMajor_change(Map map);

}

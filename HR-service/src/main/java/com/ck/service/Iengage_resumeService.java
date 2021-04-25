package com.ck.service;

import com.ck.entity.Engage_resume;

import java.util.List;
import java.util.Map;

public interface Iengage_resumeService {
    //添加Engage_resume表数据
    public void addEngage_resume(Engage_resume engage_resume);

    //根据多个条件查询Engage_resume表(简历筛选)
    public List<Engage_resume> queryByif(Map map);

    //根据id查询Engage_resume表
    public Engage_resume queryByres_id(int res_id);

    //复核中进行的修改
    public void updateEngage_resum(Engage_resume engage_resume);

    //根据多个条件查询Engage_resume表(有效简历查询)
    public List<Engage_resume> queryByvalid(Map map);

}

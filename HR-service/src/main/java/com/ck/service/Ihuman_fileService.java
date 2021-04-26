package com.ck.service;

import com.ck.entity.Human_file;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface Ihuman_fileService {
    //人力资源档案登记复核前查询
    public List<Human_file> queryreviewer();
    //人力资源档案登记复核查询
    public Human_file queryByidreviewer02(int human_id);
    //人力资源档案登记添加
    public void addIhmanZeng(Human_file human_file);
    //人力资源多条件查询
    public List<Human_file> queryhumanlist(Map map);
    //编号查询
    public int querybybianhao();
    //人力资源档案复核
    public void dateIhmanZeng(Human_file human_file);
    //人力资源档案变更
    public void dateIhmanZengbg(Human_file human_file);
    //完全删除删除操作
    public int delHumanfile(int hfd_id);
    //假删除
    public int datajiashanchu(int human_id);
    //人力资源档案多条件查询状态值等于二
    public List<Human_file> queryhumanlist01(Map map);
    //人力资源档案多条件查询状态值等于三
    public List<Human_file> queryhumanlist03(Map map);
    //回复假删除的操作
    public int huifudechongqirensheng(int human_id);
    //假删除的查询
    public List<Human_file> queryreviewer01();
}

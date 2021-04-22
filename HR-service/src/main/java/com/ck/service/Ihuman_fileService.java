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
}

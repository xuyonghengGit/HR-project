package com.ck.service;

import com.ck.entity.Config_public_char;

import java.util.List;

public interface Iconfig_public_charService {
    //查询Config_public_char所有
    public List<Config_public_char> queryBychar();
    //删除Config_public_char  根据id做删除
    public void dle(int id);
    //添加
    public void insertT(Config_public_char config);
    //查寻职称  职称对应的种类是2
    public List<Config_public_char> queryByID2(int id);
}

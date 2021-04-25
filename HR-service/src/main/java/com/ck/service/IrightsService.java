package com.ck.service;

import com.ck.entity.Rights;
import com.ck.entity.rights_control;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * 角色业务
 */
public interface IrightsService {
    //查询所有
    public List<Rights> queryAll();
    //查询分页
    public Page<Rights> queryBypage(int pageNum,int pageSize);
    //查询角色和权限
    public Rights queryAndcontro(int id);
    //修改控制权限
    public void updaterights(Rights r, rights_control rc);
    //添加
    public void addrights(Rights r);
}

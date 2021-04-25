package com.ck.service.impl;

import com.ck.dao.IrightsDao;
import com.ck.dao.Irights_controlDao;
import com.ck.entity.Rights;
import com.ck.entity.rights_control;
import com.ck.service.IrightsService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IrightsServiceImpl implements IrightsService {
    //自动注入角色dao
    @Autowired
    private IrightsDao dao;
    //自动注入权限dao
    @Autowired
    private Irights_controlDao controlDao;


    @Override
    public List<Rights> queryAll() {
        return dao.queryAll();
    }

    @Override
    public Page<Rights> queryBypage(int pageNum,int pageSize) {
        Page<Rights> page = PageHelper.startPage(pageNum, pageSize);
        dao.queryrightsAll();
        return page;
    }

    @Override
    public Rights queryAndcontro(int id) {
        return dao.queryAndcontro(id);
    }

    @Override
    public void updaterights(Rights r, rights_control rc) {
        dao.updaterights(r);
        controlDao.updatecontrol(rc);
    }

    @Override
    public void addrights(Rights r) {
        dao.addrights(r);
        controlDao.addcontrol(r.getR_id());
    }
}

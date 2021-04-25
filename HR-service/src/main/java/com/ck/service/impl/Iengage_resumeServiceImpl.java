package com.ck.service.impl;

import com.ck.dao.Iengage_resumeDao;
import com.ck.entity.Engage_resume;
import com.ck.service.Iengage_resumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class Iengage_resumeServiceImpl implements Iengage_resumeService {
    @Autowired
    private Iengage_resumeDao iengage_resumeDao;

    //添加Engage_resume表
    @Override
    public void addEngage_resume(Engage_resume engage_resume) {
        iengage_resumeDao.addEngage_resume(engage_resume);
    }

    //根据多个条件查询Engage_resume表
    @Override
    public List<Engage_resume> queryByif(Map map) {
        return iengage_resumeDao.queryByif(map);
    }

    //根据id查询Engage_resume表
    @Override
    public Engage_resume queryByres_id(int res_id) {
        return iengage_resumeDao.queryByres_id(res_id);
    }

    //复核中进行的修改
    @Override
    public void updateEngage_resum(Engage_resume engage_resume) {
        iengage_resumeDao.updateEngage_resum(engage_resume);
    }

    @Override
    public List<Engage_resume> queryByvalid(Map map) {
        return iengage_resumeDao.queryByvalid(map);
    }


}

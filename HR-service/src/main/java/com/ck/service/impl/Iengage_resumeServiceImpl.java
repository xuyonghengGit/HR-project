package com.ck.service.impl;

import com.ck.dao.Iengage_resumeDao;
import com.ck.entity.Engage_resume;
import com.ck.service.Iengage_resumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Iengage_resumeServiceImpl implements Iengage_resumeService {
    @Autowired
    private Iengage_resumeDao iengage_resumeDao;

    @Override
    public void addEngage_resume(Engage_resume engage_resume) {
        iengage_resumeDao.addEngage_resume(engage_resume);
    }
}

package com.ck.service.impl;

import com.ck.dao.IMajor_changeDao;
import com.ck.entity.Major_Change;
import com.ck.service.IMajor_changeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IMajor_changeServiceImpl implements IMajor_changeService {
    @Autowired
    private IMajor_changeDao iMajor_changeDao;
    @Override
    public List<Major_Change> queryAlltransferMajor_change() {
        return iMajor_changeDao.queryAlltransferMajor_change();
    }
}

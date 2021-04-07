package com.ck.service.impl;

import com.ck.dao.ItestDao;
import com.ck.entity.Mytest;
import com.ck.service.Mytestsercice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MytestserciceImpl implements Mytestsercice {
    @Autowired
    private ItestDao testdao;

    @Override
    public List<Mytest> QueryAllIndexTest() {
        return testdao.QueryAllIndexTest();
    }
}

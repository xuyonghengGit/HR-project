package com.ck.service.impl;

import com.ck.dao.Iconfig_public_charDao;
import com.ck.entity.Config_public_char;
import com.ck.service.Iconfig_public_charService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Iconfig_public_charServiceImpl implements Iconfig_public_charService {
    @Autowired
    private Iconfig_public_charDao iconfig_public_charDao;

    @Override
    public List<Config_public_char> queryBychar() {
        return iconfig_public_charDao.queryBychar();
    }

    @Override
    public void dle(int id) {
        iconfig_public_charDao.dle(id);
    }

    @Override
    public void insertT(Config_public_char config) {
        iconfig_public_charDao.insertT(config);
    }

    @Override
    public List<Config_public_char> queryByID2(int id) {
        return iconfig_public_charDao.queryByID2(id);
    }
}

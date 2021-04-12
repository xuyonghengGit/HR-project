package com.ck.service.impl;

import com.ck.dao.Iconfig_majorDao;
import com.ck.entity.Config_major;
import com.ck.service.Iconfig_majorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Iconfig_majorServiceImpl implements Iconfig_majorService {

    @Autowired
    private Iconfig_majorDao iconfig_majorDao;
    //根据major_kind_id查询Config_major表
    @Override
    public List<Config_major> queryBymajorkindid(int mfk_id) {
        return iconfig_majorDao.queryBymajorkindid(mfk_id);
    }
}

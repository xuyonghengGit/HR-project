package com.ck.service.impl;

import com.ck.dao.Iconfig_file_third_kindDao;
import com.ck.entity.Config_file_third_kind;
import com.ck.service.Iconfig_file_third_kindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Iconfig_file_third_kindServiceImpl implements Iconfig_file_third_kindService {
    @Autowired
    private Iconfig_file_third_kindDao iconfig_file_third_kindDao;
    //根据二级机构编号查询三级机构
    @Override
    public List<Config_file_third_kind> querythird(int second_kind_id) {
        return iconfig_file_third_kindDao.querythird(second_kind_id);
    }
}

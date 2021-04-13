package com.ck.service.impl;

import com.ck.dao.Iconfig_file_second_kindDao;
import com.ck.entity.Config_file_second_kind;
import com.ck.service.Iconfig_file_second_kindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Iconfig_file_second_kindServiceImpl implements Iconfig_file_second_kindService {
    @Autowired
    private Iconfig_file_second_kindDao kindDao;
    //根据编号查询二级机构中的数据
    @Override
    public List<Config_file_second_kind> querysecond(int first_kind_id) {
        return kindDao.querysecond(first_kind_id);
    }
}

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


    //查询二级机构中所有数据
    @Override
    public List<Config_file_second_kind> queryAllConfig_file_second_kind() {
        return kindDao.queryAllConfig_file_second_kind();
    }

    @Override
    public void updateById(Config_file_second_kind second) {
        kindDao.updateById(second);
    }

    @Override
    public Config_file_second_kind queryByidConfig_file_second_kind(int fsk_id) {
        return kindDao.queryByidConfig_file_second_kind(fsk_id);
    }

    @Override
    public void deleteById(int id) {
        kindDao.deleteById(id);
    }

    @Override
    public void insertConfig_file_second_kind(Config_file_second_kind second) {
        kindDao.insertConfig_file_second_kind(second);
    }
}

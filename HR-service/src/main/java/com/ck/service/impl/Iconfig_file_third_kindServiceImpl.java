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
    private Iconfig_file_third_kindDao iconfig;
    //根据二级机构编号查询三级机构
    @Override
    public List<Config_file_third_kind> querythird(int second_kind_id) {
        return iconfig.querythird(second_kind_id);
    }

    @Override
    public List<Config_file_third_kind> queryConfig_file_third_kind() {
        return iconfig.queryConfig_file_third_kind();
    }

    @Override
    public Config_file_third_kind queryByidConfig_file_third_kind(int id) {
        return iconfig.queryByidConfig_file_third_kind(id);
    }

    @Override
    public void updateConfig_file_third_kind(Config_file_third_kind file) {
        iconfig.updateConfig_file_third_kind(file);
    }

    @Override
    public void deleteById(int id) {
        iconfig.deleteById(id);
    }

    @Override
    public void inse(Config_file_third_kind kind) {
        iconfig.inse(kind);
    }
}

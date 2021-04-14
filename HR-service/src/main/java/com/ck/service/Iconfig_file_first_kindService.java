package com.ck.service;

import com.ck.entity.Config_file_first_kind;

import java.util.List;

public interface Iconfig_file_first_kindService {
    public List<Config_file_first_kind> queryAll();
    public Config_file_first_kind queryById(int id);
    public void updateById(Config_file_first_kind file);
    public void deleteById(int id);
    public void insets(Config_file_first_kind first);
}

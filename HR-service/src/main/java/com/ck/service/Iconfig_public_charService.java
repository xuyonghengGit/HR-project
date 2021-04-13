package com.ck.service;

import com.ck.entity.Config_public_char;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Iconfig_public_charService {
    //查询Config_public_char所有
    public List<Config_public_char> queryBychar();
}

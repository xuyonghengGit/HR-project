package com.ck.service;

import com.ck.entity.Config_major;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Iconfig_majorService {

    //根据major_kind_id查询Config_major表
    public List<Config_major> queryBymajorkindid(int mfk_id);
}

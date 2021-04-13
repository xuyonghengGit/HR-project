package com.ck.service;

import com.ck.entity.Human_file;
import org.springframework.stereotype.Service;

import java.util.List;
public interface Ihuman_fileService {
    //人力资源档案登记复核前查询
    public List<Human_file> queryreviewer();
}

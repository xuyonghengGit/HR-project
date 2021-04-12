package com.ck.service.impl;

import com.ck.dao.IHuman_fileDao;
import com.ck.entity.Human_file;
import com.ck.service.Ihuman_fileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Ihuman_fileServiceImpl implements Ihuman_fileService {
    @Autowired
    //获取iHuman_fileDao里面的内容
    private IHuman_fileDao iHuman_fileDao;
    @Override
    //人力资源档案登记复核前查询
    public List<Human_file> queryreviewer() {
        return iHuman_fileDao.queryreviewer();
    }
}

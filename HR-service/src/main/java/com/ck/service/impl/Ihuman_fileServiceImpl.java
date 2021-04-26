package com.ck.service.impl;

import com.ck.dao.IHuman_fileDao;
import com.ck.entity.Human_file;
import com.ck.service.Ihuman_fileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Override
    //人力资源档案登记复核查询
    public Human_file queryByidreviewer02(int human_id) {
        return iHuman_fileDao.queryByidreviewer02(human_id);
    }

    @Override
    //人力资源档案登记添加
    public void addIhmanZeng(Human_file human_file) {
        iHuman_fileDao.addIhmanZeng(human_file);
    }

    @Override
    public List<Human_file> queryhumanlist(Map map) {
        return iHuman_fileDao.queryhumanlist(map);
    }

    @Override
    public int querybybianhao() {
        return iHuman_fileDao.querybybianhao();
    }

    @Override
    public void dateIhmanZeng(Human_file human_file) {
        iHuman_fileDao.dateIhmanZeng(human_file);
    }

    @Override
    public void dateIhmanZengbg(Human_file human_file) {
        iHuman_fileDao.dateIhmanZengbg(human_file);
    }

    @Override
    public int delHumanfile(int hfd_id) {
        return iHuman_fileDao.delHumanfile(hfd_id);
    }

    @Override
    public int datajiashanchu(int human_id) {
        return iHuman_fileDao.datajiashanchu(human_id);
    }

    @Override
    public List<Human_file> queryhumanlist01(Map map) {
        return iHuman_fileDao.queryhumanlist01(map);
    }

    @Override
    public List<Human_file> queryhumanlist03(Map map) {
        return iHuman_fileDao.queryhumanlist03(map);
    }

    @Override
    public int huifudechongqirensheng(int human_id) {
        return iHuman_fileDao.huifudechongqirensheng(human_id);
    }

    @Override
    public List<Human_file> queryreviewer01() {
        return iHuman_fileDao.queryreviewer01();
    }

}

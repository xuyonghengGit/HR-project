package com.ck.service.impl;

import com.ck.dao.IMajor_changeDao;
import com.ck.entity.Human_file;
import com.ck.entity.Major_Change;
import com.ck.service.IMajor_changeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class IMajor_changeServiceImpl implements IMajor_changeService {
    @Autowired
    private IMajor_changeDao iMajor_changeDao;
    //查询Major_change表 (未通过)

    @Override
    public List<Major_Change> queryBycheck_statusTFMajor_change() {
        return iMajor_changeDao.queryBycheck_statusTFMajor_change();
    }

    //根据mch_id查询Major_change表-（审核）
    @Override
    public Major_Change queryBymch_idtransferMajor_change(int mch_id) {
        return iMajor_changeDao.queryBymch_idtransferMajor_change(mch_id);
    }
    //多条件查询人力资源档案（一级，二级，三级机构，档案登记时间，档案状态）
    @Override
    public List<Human_file> queryConditiontransferHuman_file(Map map) {
        return iMajor_changeDao.queryConditiontransferHuman_file(map);
    }
    //根据hfd_id查询人力资源档案
    @Override
    public Human_file queryByHfd_idtransferHuman_file(int hfd_id) {
        return iMajor_changeDao.queryByHfd_idtransferHuman_file(hfd_id);
    }

    @Override
    public void addTransferMajor_change(Major_Change major_change) {
        iMajor_changeDao.addTransferMajor_change(major_change);
    }

    @Override
    public void updateTransferMajor_change(Map map) {
        iMajor_changeDao.updateTransferMajor_change(map);
    }

    @Override
    public void updateTransferHumanFile(Map map) {
        iMajor_changeDao.updateTransferHumanFile(map);
    }

    @Override
    public List<Major_Change> queryConditiontransferMajor_change(Map map) {
        return iMajor_changeDao.queryConditiontransferMajor_change(map);
    }

    @Override
    public void updateTransferHumanFiletatus(int s) {
        iMajor_changeDao.updateTransferHumanFiletatus(s);
    }
}

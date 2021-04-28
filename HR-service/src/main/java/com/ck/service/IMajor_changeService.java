package com.ck.service;
/**
 * 刘伟
 */
import com.ck.entity.Human_file;
import com.ck.entity.Major_Change;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


public interface IMajor_changeService {
    //查询Major_change表 (未通过)
    public List<Major_Change> queryBycheck_statusTFMajor_change();

    //根据mch_id查询Major_change表-（审核）
    public Major_Change queryBymch_idtransferMajor_change(int mch_id);

    //多条件查询人力资源档案（一级，二级，三级机构，档案登记时间，档案状态）
    public List<Human_file> queryConditiontransferHuman_file(Map map);

    //根据hfd_id查询人力资源档案
    public Human_file queryByHfd_idtransferHuman_file(int hfd_id);

    //添加Major_change表数据
    public void addTransferMajor_change(Major_Change major_change);

    //修改Major_change表数据
    public void updateTransferMajor_change(Map map);
    //修改HumanFile表数据
    public void updateTransferHumanFile(Map map);

    //多条件查询Major_change表数据（一级，二级，三级机构，职位分类，职位，档案登记时间，档案状态）
    public List<Major_Change> queryConditiontransferMajor_change(Map map);

    //修改HumanFile表数据
    public void updateTransferHumanFiletatus(int s);
}

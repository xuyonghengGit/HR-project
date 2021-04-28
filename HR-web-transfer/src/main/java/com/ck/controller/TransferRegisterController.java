package com.ck.controller;

import com.ck.dao.IMajor_changeDao;
import com.ck.entity.Human_file;
import com.ck.entity.Major_Change;
import com.ck.service.IMajor_changeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class TransferRegisterController {
    @Autowired
    private IMajor_changeService iMajor_changeService;
    @Autowired
    private IMajor_changeDao iMajor_changeDao;
    //多条件查询人力资源档案（一级，二级，三级机构，档案登记时间，档案状态）
    //    您正在做的业务是：人力资源--调动管理--调动登记查询

    @RequestMapping("queryConditiontransferHuman_file")
    public String queryConditiontransferHuman_file(ModelMap map, @RequestParam Map map2){
//        System.out.println(map2);
        List<Human_file> human_fileList = iMajor_changeService.queryConditiontransferHuman_file(map2);
        map.addAttribute("list_HF",human_fileList);
        return "transfer/register_list";
    }
    //根据hfd_id查询人力资源档案
    //您在做的业务是-人力资源-调动管理-调动登记列表
    @RequestMapping("queryByHfd_idtransferHuman_file")
    public String queryByHfd_idtransferHuman_file(ModelMap map,int hfd_id){
        Human_file human_fileList2 = iMajor_changeService.queryByHfd_idtransferHuman_file(hfd_id);
        map.addAttribute("list_HF2",human_fileList2);
        return "transfer/register";
    }
    //添加Major_change表
    @RequestMapping("addTransferMajor_change")
    public String addTransferMajor_change(Major_Change major_change){
        System.out.println("实体类数据————————————————————————————————"+major_change);
        iMajor_changeService.addTransferMajor_change(major_change);
        iMajor_changeService.updateTransferHumanFiletatus(1);
        return "transfer/register_success";
    }
}

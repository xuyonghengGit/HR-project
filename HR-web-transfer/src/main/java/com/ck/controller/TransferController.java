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
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class TransferController {
    @Autowired
    private IMajor_changeService iMajor_changeService;
    @Autowired
    private IMajor_changeDao iMajor_changeDao;


    //多条件查询Major_change（一级，二级，三级机构 职位，档案登记时间，档案状态）
    @RequestMapping("queryConditiontransferMajor_change")
    public String queryConditiontransferMajor_change(ModelMap map, @RequestParam Map map2){
        System.out.println(map2);
        List<Major_Change> major_changeList = iMajor_changeService.queryConditiontransferMajor_change(map2);
        map.addAttribute("list_MC",major_changeList);
        return "transfer/list";
    }

    //根据mch_id查询Major_change表
    @RequestMapping("queryByMch_idTFMajor_change")
    public String queryByMch_idTFMajor_change (ModelMap map,int mch_id){
        Major_Change major_change = iMajor_changeService.queryBymch_idtransferMajor_change(mch_id);
        map.addAttribute("MC2", major_change);
        return "transfer/detail";
    }
}

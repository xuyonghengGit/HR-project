package com.ck.controller;

import com.ck.dao.IMajor_changeDao;
import com.ck.entity.Major_Change;
import com.ck.service.IMajor_changeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class TransferCheckController {
    @Autowired
    private IMajor_changeService iMajor_changeService;
    @Autowired
    private IMajor_changeDao iMajor_changeDao;
    //点击调动审核进入
    //根据状态查询Major_change表（未通过）
    @RequestMapping("queryBycheck_statusTFMajor_change")
    public String queryBycheck_statusTFMajor_change(ModelMap map){
        List<Major_Change> listMC =iMajor_changeService.queryBycheck_statusTFMajor_change();
        map.addAttribute("list_MC",listMC);
//        返回到check_list.html
        return "transfer/check_list";
    }
    //点击调动审核—>审核进入
    //根据mch_id查询Major_change表
    @RequestMapping("queryBymch_idtransferMajor_change")
    public String queryBymch_idtransferMajor_change(ModelMap map,int mch_id){
        Major_Change major_change = iMajor_changeService.queryBymch_idtransferMajor_change(mch_id);
        map.addAttribute("MC",major_change);
//        返回到check.html
        return "transfer/check";
    }
    //修改Major_change表
    @RequestMapping("updateTransferMajor_change")
    public String updateTransferMajor_change(@RequestParam Map map ){
        System.out.println("界面值-------------------"+map);
        Object check_status = map.get("check_status");
        int i = Integer.parseInt(check_status + "");
        if (i==0){
//            System.out.println("不通过");
                    iMajor_changeService.updateTransferMajor_change(map);
        }else {
//            System.out.println("通过");
                    iMajor_changeService.updateTransferMajor_change(map);
                    iMajor_changeService.updateTransferHumanFile(map);
        }
        return "transfer/check_success";
    }
    //    public String updateTransferMajor_change(Major_Change major_change){
//        System.out.println(major_change);
////        iMajor_changeService.updateTransferMajor_change(major_change);
//        return "transfer/check_success";
//    }
}

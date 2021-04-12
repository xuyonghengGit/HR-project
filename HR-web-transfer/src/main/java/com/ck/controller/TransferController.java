package com.ck.controller;

import com.ck.dao.IMajor_changeDao;
import com.ck.entity.Major_Change;
import com.ck.service.IMajor_changeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TransferController {
    @Autowired
    private IMajor_changeService iMajor_changeService;
    @Autowired
    private IMajor_changeDao iMajor_changeDao;
    @RequestMapping("queryAlltransferMajor_change")
    public String queryAlltransferMajor_change(){
        List<Major_Change> listMC =iMajor_changeDao.queryAlltransferMajor_change();
        return "register_list";
    }
}

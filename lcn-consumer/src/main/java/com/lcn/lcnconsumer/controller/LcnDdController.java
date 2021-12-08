package com.lcn.lcnconsumer.controller;


import com.lcn.lcnconsumer.entity.LcnDd;
import com.lcn.lcnconsumer.service.ILcnDdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2021-12-05
 */
@RestController
@RequestMapping("/lcnDd")
public class LcnDdController {

    @Autowired
    ILcnDdService iLcnDdService;
    @RequestMapping("/insertDD")
    public Object insertDD(LcnDd lcnDd){
        return iLcnDdService.insertDD(lcnDd);
    }

}


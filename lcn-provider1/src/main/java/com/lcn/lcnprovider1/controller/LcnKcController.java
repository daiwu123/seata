package com.lcn.lcnprovider1.controller;


import com.lcn.lcnprovider1.service.ILcnKcService;
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
@RequestMapping("/lcnKc")
public class LcnKcController {

    @Autowired
    ILcnKcService iLcnKcService;

    @RequestMapping("/insertKuCunCount")
    public Object insertKuCunCount(){
       return  iLcnKcService.insertKuCunCount();
    }
}


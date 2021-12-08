package com.lcn.lcnconsumer.service.impl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;

@FeignClient(name="lcn-provider1")
public interface LcnProviderFeign {

    @RequestMapping(value = "/lcnKc/insertKuCunCount",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    Object insertKuCunCount();
}

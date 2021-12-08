package com.lcn.lcnconsumer.service.impl;

import com.lcn.lcnconsumer.entity.LcnDd;
import com.lcn.lcnconsumer.dao.LcnDdMapper;
import com.lcn.lcnconsumer.service.ILcnDdService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2021-12-05
 */
@Service
@Slf4j
public class LcnDdServiceImpl extends ServiceImpl<LcnDdMapper, LcnDd> implements ILcnDdService {

    @Autowired
    LcnDdMapper lcnDdMapper;


    @Autowired
    LcnProviderFeign lcnProviderFeign;


    @Override
    @GlobalTransactional
    public Object insertDD(LcnDd lcnDd){
        lcnDdMapper.insert(lcnDd);
        Object res = lcnProviderFeign.insertKuCunCount();
        log.info(res.toString());
        int i = 1/lcnDd.getCount();
        return  res;
    }
}

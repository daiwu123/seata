package com.lcn.lcnprovider1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lcn.lcnprovider1.dao.LcnKcMapper;
import com.lcn.lcnprovider1.entity.LcnKc;
import com.lcn.lcnprovider1.service.ILcnKcService;
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
public class LcnKcServiceImpl extends ServiceImpl<LcnKcMapper, LcnKc> implements ILcnKcService {


    @Autowired
    LcnKcMapper lcnKcMapper;

    @Override
    public Object insertKuCunCount() {
        LcnKc lcnKc = new LcnKc();
        lcnKc.setName("age1");
        lcnKcMapper.insert(lcnKc);
        return lcnKc;
    }
}

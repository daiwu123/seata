package com.lcn.lcnconsumer.service;

import com.lcn.lcnconsumer.entity.LcnDd;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2021-12-05
 */
public interface ILcnDdService extends IService<LcnDd> {

     Object insertDD(LcnDd lcnDd);
}

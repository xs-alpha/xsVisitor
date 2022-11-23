package com.xiaosheng.services.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaosheng.dao.po.ReserveEvaluatePO;
import com.xiaosheng.dao.mapper.ReserveEvaluateMapper;
import org.springframework.stereotype.Service;

/**
 * @author lpy
 * @date 2022-11-23 15:24:02
 *
 * @description 评价表
 */
@Service
public class ReserveEvaluateService extends ServiceImpl<ReserveEvaluateMapper, ReserveEvaluatePO>  implements IService<ReserveEvaluatePO> {

}


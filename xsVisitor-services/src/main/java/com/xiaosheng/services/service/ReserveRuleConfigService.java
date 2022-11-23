package com.xiaosheng.services.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaosheng.dao.po.ReserveRuleConfigPO;
import com.xiaosheng.dao.mapper.ReserveRuleConfigMapper;
import org.springframework.stereotype.Service;

/**
 * @author lpy
 * @date 2022-11-23 15:24:05
 *
 * @description 规则配置表
 */
@Service
public class ReserveRuleConfigService extends ServiceImpl<ReserveRuleConfigMapper, ReserveRuleConfigPO>  implements IService<ReserveRuleConfigPO> {

}


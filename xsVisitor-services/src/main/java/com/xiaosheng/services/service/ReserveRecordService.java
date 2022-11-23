package com.xiaosheng.services.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaosheng.dao.po.ReserveRecordPO;
import com.xiaosheng.dao.mapper.ReserveRecordMapper;
import org.springframework.stereotype.Service;

/**
 * @author lpy
 * @date 2022-11-23 15:24:05
 *
 * @description 预约记录表
 */
@Service
public class ReserveRecordService extends ServiceImpl<ReserveRecordMapper, ReserveRecordPO>  implements IService<ReserveRecordPO> {

}


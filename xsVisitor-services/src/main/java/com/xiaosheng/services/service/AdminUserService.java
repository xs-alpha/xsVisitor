package com.xiaosheng.services.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaosheng.dao.po.AdminUserPO;
import com.xiaosheng.dao.mapper.AdminUserMapper;
import org.springframework.stereotype.Service;

/**
 * @author lpy
 * @date 2022-11-23 15:20:52
 *
 * @description 后台用户表
 */
@Service
public class AdminUserService extends ServiceImpl<AdminUserMapper, AdminUserPO>  implements IService<AdminUserPO> {

}


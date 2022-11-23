package com.xiaosheng.services.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaosheng.dao.po.UserPO;
import com.xiaosheng.dao.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author lpy
 * @date 2022-11-23 15:20:53
 *
 * @description 用户表
 */
@Service
public class UserService extends ServiceImpl<UserMapper, UserPO>  implements IService<UserPO> {

}


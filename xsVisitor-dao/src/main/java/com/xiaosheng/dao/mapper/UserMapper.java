package com.xiaosheng.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaosheng.dao.po.UserPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lpy
 * @date 2022-11-23 15:20:53
 *
 * @description 用户表
 */
@Mapper
public interface UserMapper extends BaseMapper<UserPO> {

}


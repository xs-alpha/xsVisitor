package com.xiaosheng.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaosheng.dao.po.AdminUserPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lpy
 * @date 2022-11-23 15:20:52
 *
 * @description 后台用户表
 */
@Mapper
public interface AdminUserMapper extends BaseMapper<AdminUserPO> {

}


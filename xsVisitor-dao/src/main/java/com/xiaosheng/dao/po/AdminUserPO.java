package com.xiaosheng.dao.po;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;


import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author lpy
 * @date 2022-11-23 15:20:52
 *
 * @description 后台用户表
 */
@Data
@TableName("admin_user")
@Accessors(chain = true)
public class AdminUserPO  {


    /**
     * 主键ID
     */
    @TableId(value = "admin_user_id", type =  IdType.INPUT )
    private Long adminUserId;

    /**
     * 工号
     */
    private String emplNo;

    /**
     * 姓名
     */
    private String adminName;

    /**
     * 密码
     */
    private String password;

    /**
     * 1-正常 2-封禁
     */
    private Integer state;

    /**
     * 是否超级管理员 0-否 1-是
     */
    private Integer isSuper;

    /**
     * 创建时间
     */
    private Date createTm;

    /**
     * 更新时间
     */
    private Date updateTm;
}

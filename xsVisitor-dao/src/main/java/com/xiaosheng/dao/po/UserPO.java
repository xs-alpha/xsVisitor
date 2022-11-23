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
 * @date 2022-11-23 15:20:53
 *
 * @description 用户表
 */
@Data
@TableName("user")
@Accessors(chain = true)
public class UserPO  {


    /**
     * userID
     */
    @TableId(value = "user_id", type =  IdType.INPUT )
    private Long userId;

    /**
     * 钉钉userId
     */
    private String openId;

    /**
     * 1-正常
     */
    private Integer state;

    /**
     * 最后活跃时间
     */
    private Date lastActiveAt;

    /**
     * 创建时间
     */
    private Date createTm;

    /**
     * 更新时间
     */
    private Date updateTm;
}

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
 * @date 2022-11-23 15:24:02
 *
 * @description 评价表
 */
@Data
@TableName("reserve_evaluate")
@Accessors(chain = true)
public class ReserveEvaluatePO  {


    /**
     * 评价ID
     */
    @TableId(value = "reserve_evaluate_id", type =  IdType.INPUT )
    private Long reserveEvaluateId;

    /**
     * 预约记录ID
     */
    private Long reserveRecordId;

    /**
     * userID
     */
    private Long userId;

    /**
     * 等级(1:*,2**:,3:***,4:****:,5:*****)
     */
    private Integer evaluateRank;

    /**
     * 评价描述
     */
    private String evaluateDesc;

    /**
     * 创建时间
     */
    private Date createTm;

    /**
     * 更新时间
     */
    private Date updateTm;
}

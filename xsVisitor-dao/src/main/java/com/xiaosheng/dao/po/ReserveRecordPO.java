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
 * @date 2022-11-23 15:24:05
 *
 * @description 预约记录表
 */
@Data
@TableName("reserve_record")
@Accessors(chain = true)
public class ReserveRecordPO  {


    /**
     * 预约记录ID
     */
    @TableId(value = "reserve_record_id", type =  IdType.INPUT )
    private Long reserveRecordId;

    /**
     * userID
     */
    private Long userId;

    /**
     * 类型(1:个人,2:工业旅游,3:业务来访,4:参观交流,5:政务参观,6:其他)
     */
    private Integer type;

    /**
     * 预约日期
     */
    private Date reserveDate;

    /**
     * 预约时间
     */
    private String reserveTime;

    /**
     * 姓名
     */
    private String name;

    /**
     * 电话
     */
    private String tel;

    /**
     * 人数
     */
    private Integer recNumber;

    /**
     * 个人:性别(1:男,2:女)
     */
    private Integer sex;

    /**
     * 个人:身份证
     */
    private String idNo;

    /**
     * 描述
     */
    private String recDesc;

    /**
     * 来访者单位
     */
    private String recBusiness;

    /**
     * 欢迎词
     */
    private String recWelcome;

    /**
     * 讲解需求(0:不需要,1:需要)
     */
    private Integer speakNeed;

    /**
     * 讲解人姓名
     */
    private String speakerName;

    /**
     * 管理员备注
     */
    private String adminNotes;

    /**
     * 联系人部门
     */
    private String department;

    /**
     * 联系人姓名
     */
    private String depName;

    /**
     * 联系人电话
     */
    private String depTel;

    /**
     * 特殊要求
     */
    private String specialReq;

    /**
     * 拒绝原因
     */
    private String reason;

    /**
     * 状态(1:未审核,2:已通过,3:已拒绝,4:已取消,5:已到达,6:已评价)
     */
    private Integer state;

    /**
     * 创建时间
     */
    private Date createTm;

    /**
     * 更新时间
     */
    private Date updateTm;
}

package com.lgy.oms.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lgy.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 配货策略预分配信息明细表 oms_strategy_distribution_pre_detail
 *
 * @author lgy
 * @date 2020-02-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("oms_strategy_distribution_pre_detail")
public class StrategyDistributionPreDetail extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long id;

    /**
     * 策略编码
     */
    private String gco;

    /**
     * 对应父表自增id
     */
    private Long parentId;

    /**
     * 属性类型(订单主信息/订单用户信息/订单支付信息...)
     */
    private String type;

    /**
     * 规则对应的字段
     */
    private String field;

    /**
     * 条件(大于/小于/等于/不等于/包含/正则)
     */
    private String requirement;

    /**
     * 匹配值(多条用英文逗号分隔)
     */
    private String valueCode;

    /**
     * 匹配值(中文含义)
     */
    private String valueName;

    /**
     * 状态（0启用 1停用）
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

}

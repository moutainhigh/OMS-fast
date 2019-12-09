package com.lgy.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgy.oms.domain.order.OrderMain;

/**
 * 订单审核信息 服务层
 *
 * @author lgy
 * @date 2019-11-25
 */
public interface IOrderMainService extends IService<OrderMain> {


    /**
     * 保存订单
     *
     * @param orderMain 订单主体
     * @return
     */
    OrderMain saveOrder(OrderMain orderMain);
}
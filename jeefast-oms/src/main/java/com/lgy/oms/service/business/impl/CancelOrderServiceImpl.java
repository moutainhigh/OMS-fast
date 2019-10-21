package com.lgy.oms.service.business.impl;

import com.lgy.common.core.domain.CommonResponse;
import com.lgy.oms.domain.dto.OrderDTO;
import com.lgy.oms.service.business.ICancelOrderService;
import org.springframework.stereotype.Service;

/**
 * @Description 取消订单服务实现
 * @Author LGy
 * @Date 2019/10/15
 */
@Service
public class CancelOrderServiceImpl implements ICancelOrderService {

    @Override
    public CommonResponse<String> cancelOrder(OrderDTO orderDTO) {
        return null;
    }
}
package net.roundspring.sell.service.impl;

import lombok.extern.slf4j.Slf4j;
import net.roundspring.sell.dto.OrderDTO;
import net.roundspring.sell.enums.ResultEnum;
import net.roundspring.sell.exception.SellException;
import net.roundspring.sell.service.BuyerService;
import net.roundspring.sell.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private OrderService orderService;

    @Override
    public OrderDTO findOrderOne(String openid, String orderId) {
        return checkOrderOwner(openid, orderId);
    }

    @Override
    public OrderDTO cancelOrder(String openid, String orderId) {
        OrderDTO orderDTO = checkOrderOwner(openid, orderId);
        if (orderDTO == null) {
            log.error("cancel order: order cannot be found");
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }
        return orderService.cancel(orderDTO);
    }

    private OrderDTO checkOrderOwner(String openid, String orderId) {
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null) {
            return null;
        }
        if (!orderDTO.getBuyerOpenid().equalsIgnoreCase(openid)) {
            log.error("find order: error. buyerOpenid does not match order");
            throw new SellException(ResultEnum.OPENID_NOT_MATCH);
        }
        return orderDTO;
    }
}

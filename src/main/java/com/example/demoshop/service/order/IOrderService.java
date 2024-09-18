package com.example.demoshop.service.order;

import com.example.demoshop.dto.OrderDto;
import com.example.demoshop.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);
}

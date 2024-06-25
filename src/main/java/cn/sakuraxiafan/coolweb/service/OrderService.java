package cn.sakuraxiafan.coolweb.service;

import cn.sakuraxiafan.coolweb.entity.Order;
import cn.sakuraxiafan.coolweb.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderMapper orderMapper;

    @Autowired
    public OrderService(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    public Order getOrderById(Long id) {
        return orderMapper.selectOrderById(id);
    }

    public Order selectByTradeNo(String tradeNo) {
        return orderMapper.selectByTradeNo(tradeNo);
    }

    public List<Order> getAllOrders() {
        return orderMapper.selectAllOrders();
    }

    public int createOrder(Order order) {
        return orderMapper.insertOrder(order);
    }

    public int updateOrder(Order order) {
        return orderMapper.updateOrder(order);
    }

    public int deleteOrder(Long id) {
        return orderMapper.deleteOrderById(id);
    }
}

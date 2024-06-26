package cn.sakuraxiafan.coolweb.controller;

import cn.sakuraxiafan.coolweb.entity.Order;
import cn.sakuraxiafan.coolweb.entity.User;
import cn.sakuraxiafan.coolweb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable("id") Long id) {
        return orderService.getOrderById(id);
    }

    @GetMapping("/byTradeNo/{tradNo}")
    public Order getOrderByTradeNo(@PathVariable("tradNo") String tradNo) {
        return orderService.selectByTradeNo(tradNo);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    public int createOrder(@RequestBody Order order, HttpSession session) {
        User user = (User) session.getAttribute("user");
        return orderService.createOrder(user, order);
    }

    @PutMapping("/{id}")
    public int updateOrder(@PathVariable("id") Long id, @RequestBody Order order) {
        return orderService.updateOrder(order);
    }

    @DeleteMapping("/{id}")
    public int deleteOrder(@PathVariable("id") Long id) {
        return orderService.deleteOrder(id);
    }
}

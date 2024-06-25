package cn.sakuraxiafan.coolweb.mapper;

import cn.sakuraxiafan.coolweb.entity.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper {
    @Select("SELECT * FROM orders WHERE id = #{id}")
    Order selectOrderById(@Param("id") Long id);

    @Select("SELECT * FROM orders")
    List<Order> selectAllOrders();

    @Insert("INSERT INTO orders (trade_no, subject, total_amount, alipay_trade_no) " +
            "VALUES (#{tradeNo}, #{subject}, #{totalAmount}, #{alipayTradeNo})")
    int insertOrder(Order order);

    @Update("UPDATE orders SET trade_no = #{tradeNo}, subject = #{subject}, " +
            "total_amount = #{totalAmount}, alipay_trade_no = #{alipayTradeNo} " +
            "WHERE id = #{id}")
    int updateOrder(Order order);

    @Delete("DELETE FROM orders WHERE id = #{id}")
    int deleteOrderById(@Param("id") Long id);

    @Select("select * from orders where trade_no=#{tardeNo}")
    Order selectByTradeNo(String tradeNo);
}

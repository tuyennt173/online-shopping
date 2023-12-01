package com.tuyennt173.onlineshopping;

import com.tuyennt173.onlineshopping.entity.OrderDetails;
import com.tuyennt173.onlineshopping.service.OrderDetailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderDetailUTest {

    @Autowired
    private OrderDetailService orderDetailService;

    @Test
    public void showAllOrderDetails() {
        orderDetailService.getAllOrderDetails()
                .forEach(System.out::println);
    }

    @Test
    public void showOneOrderDetail() {
        OrderDetails orderDetail = orderDetailService.getOrderDetailById(1L);
        System.out.println("orderDetail = " + orderDetail);
    }
}

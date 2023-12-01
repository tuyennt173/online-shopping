package com.tuyennt173.onlineshopping;

import com.tuyennt173.onlineshopping.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderUTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void showAllOrdersOfUser() {
        orderService.getAllOrdersOfUserName("customer")
                .forEach(System.out::println);
    }
}

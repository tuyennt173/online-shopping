package com.tuyennt173.onlineshopping.service.impl;

import com.tuyennt173.onlineshopping.entity.Orders;
import com.tuyennt173.onlineshopping.repository.OrderRepository;
import com.tuyennt173.onlineshopping.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    @Override
    public List<Orders> getAllOrdersOfUserName(String userName) {
        return orderRepository.findAllOrdersByUserName(userName);
    }

    @Override
    public Orders createNew(Orders orders) {
        return orderRepository.save(orders);
    }
}

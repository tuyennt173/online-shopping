package com.tuyennt173.onlineshopping.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tuyennt173.onlineshopping.entity.OrderDetails;
import com.tuyennt173.onlineshopping.entity.Orders;
import com.tuyennt173.onlineshopping.repository.OrderDetailRepository;
import com.tuyennt173.onlineshopping.repository.OrderRepository;
import com.tuyennt173.onlineshopping.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    private OrderDetailRepository orderDetailRepository;

    @Override
    public List<Orders> getAllOrdersOfUserName(String userName) {
        return orderRepository.findAllOrdersByUserName(userName);
    }

    @Override
    public Orders createNew(Orders orders) {
        return orderRepository.save(orders);
    }

    @Override
    public Orders createNewJsonConvertToClass(JsonNode orderJson) {
        ObjectMapper objectMapper = new ObjectMapper();
        Orders order = objectMapper.convertValue(orderJson, Orders.class);
        orderRepository.save(order);

        TypeReference<List<OrderDetails>> typeReference = new TypeReference<List<OrderDetails>>() {};
        List<OrderDetails> orderDetails = objectMapper.convertValue(
                orderJson.get("orderDetails"), typeReference).stream()
                .peek(orderDetail -> orderDetail.setOrder(order))
                .collect(Collectors.toList());
        orderDetailRepository.saveAll(orderDetails);
        return order;
    }

    @Override
    public Orders getById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
}

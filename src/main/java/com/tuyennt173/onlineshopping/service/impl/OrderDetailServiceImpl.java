package com.tuyennt173.onlineshopping.service.impl;

import com.tuyennt173.onlineshopping.entity.OrderDetails;
import com.tuyennt173.onlineshopping.repository.OrderDetailRepository;
import com.tuyennt173.onlineshopping.service.OrderDetailService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderDetailServiceImpl implements OrderDetailService {

    private OrderDetailRepository orderDetailRepository;

    @Override
    public List<OrderDetails> getAllOrderDetails() {
        return orderDetailRepository.findAll();
    }

    @Override
    public OrderDetails getOrderDetailById(Long id) {
        return orderDetailRepository.findById(id).orElse(null);
    }
}

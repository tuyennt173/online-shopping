package com.tuyennt173.onlineshopping.service;

import com.tuyennt173.onlineshopping.entity.OrderDetails;

import java.util.List;

public interface OrderDetailService {

    List<OrderDetails> getAllOrderDetails();

    OrderDetails getOrderDetailById(Long id);

}

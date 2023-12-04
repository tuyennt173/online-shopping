package com.tuyennt173.onlineshopping.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.tuyennt173.onlineshopping.entity.Orders;

import java.util.List;

public interface OrderService {

    List<Orders> getAllOrdersOfUserName(String userName);

    Orders createNew(Orders orders);

    Orders createNewJsonConvertToClass(JsonNode orderJson);

    Orders getById(Long id);
}

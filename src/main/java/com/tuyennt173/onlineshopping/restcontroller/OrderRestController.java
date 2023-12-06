package com.tuyennt173.onlineshopping.restcontroller;

import com.fasterxml.jackson.databind.JsonNode;
import com.tuyennt173.onlineshopping.entity.Orders;
import com.tuyennt173.onlineshopping.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/orders")
public class OrderRestController {

    @Autowired
    private OrderService orderService;

    @PostMapping("create")
    public ResponseEntity<Orders> createNew(@RequestBody JsonNode orderJson) {
        Orders createdOrder = orderService.createNewJsonConvertToClass(orderJson);
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }

}

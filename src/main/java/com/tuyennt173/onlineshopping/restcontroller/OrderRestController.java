package com.tuyennt173.onlineshopping.restcontroller;

import com.fasterxml.jackson.databind.JsonNode;
import com.tuyennt173.onlineshopping.entity.Orders;
import com.tuyennt173.onlineshopping.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/orders")
public class OrderRestController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Orders createNew(@RequestBody JsonNode orderJson) {
        return orderService.createNewJsonConvertToClass(orderJson);
    }

}

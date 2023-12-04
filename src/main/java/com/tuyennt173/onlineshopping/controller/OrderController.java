package com.tuyennt173.onlineshopping.controller;

import com.tuyennt173.onlineshopping.entity.Orders;
import com.tuyennt173.onlineshopping.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/checkout")
    public String show() {
        return "order/checkout";
    }

    @GetMapping("/list")
    public String listOrder() {
        return "order/list";
    }

    @GetMapping("/detail/{id}")
    public String detail(
            @PathVariable("id") Long id,
            Model model
    ) {
        Orders order = orderService.getById(id);
        model.addAttribute("order", order);
        return "order/detail";
    }

}

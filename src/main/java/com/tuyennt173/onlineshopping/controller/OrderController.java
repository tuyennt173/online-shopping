package com.tuyennt173.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/checkout")
    public String show() {
        return "order/checkout";
    }

    @GetMapping("/list")
    public String listOrder() {
        return "order/list";
    }

    @GetMapping("/detail/{id}")
    public String detail() {
        return "order/detail";
    }

}

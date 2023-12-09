package com.tuyennt173.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdministratorController {

    @GetMapping({
            "/",
            "/home/index"
    })
    public String home() {
        return "redirect:/product/list";
    }

    @GetMapping({
            "/admin",
            "/admin/home/index"
    })
    public String admin() {
        return "redirect:/assets/admin/index.html";
    }

}

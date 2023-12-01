package com.tuyennt173.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/security")
public class HandleSecurityController {

    @GetMapping("/login/form")
    public String loginForm(Model model) {
        model.addAttribute("message", "Please login.");
        return "form/login";
    }

    @GetMapping("/login/success")
    public String loginSuccess(Model model) {
        model.addAttribute("message", "Login successfully");
        return "product/list";
    }

    @GetMapping("/login/failed")
    public String loginFailed(Model model) {
        model.addAttribute("message", "Username or password is not valid.");
        return "security/login";
    }

    @GetMapping("/security/unauthorized")
    public String unauthoried(Model model) {
        model.addAttribute("message", "Access Denied!");
        return "security/login";
    }

    @GetMapping("/security/logoff/success")
    public String logout(Model model) {
        model.addAttribute("message", "Logout completely..");
        return "security/login";
    }

}

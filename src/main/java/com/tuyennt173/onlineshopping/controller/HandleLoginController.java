package com.tuyennt173.onlineshopping.controller;

import com.tuyennt173.onlineshopping.entity.Accounts;
import com.tuyennt173.onlineshopping.entity.Authorities;
import com.tuyennt173.onlineshopping.service.AccountService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/user")
public class HandleLoginController {

    private AccountService accountService;

    @GetMapping("/login/form")
    public String loginForm(Model model) {
        model.addAttribute("message", "Please login.");
        return "form/login";
    }

    @GetMapping("/login/success")
    public String loginSuccess(Model model) {
        return "redirect:/product/list";
    }

    @GetMapping("/login/failed")
    public String loginFailed(Model model) {
        model.addAttribute("message", "Username or password is not valid.");
        return "form/login";
    }

    @GetMapping("/unauthorized")
    public String unauthoried(Model model) {
        model.addAttribute("message", "Access Denied!");
        return "form/login";
    }

    @GetMapping("/logout/success")
    public String logout(Model model) {
        model.addAttribute("message", "Logout completely..");
        return "form/login";
    }

}

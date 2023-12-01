package com.tuyennt173.onlineshopping.controller;

import com.tuyennt173.onlineshopping.entity.Categories;
import com.tuyennt173.onlineshopping.entity.Products;
import com.tuyennt173.onlineshopping.service.CategoryService;
import com.tuyennt173.onlineshopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public String show(
            Model model,
            @RequestParam("cid") Optional<String> categoryId
    ) {
        if(categoryId.isPresent()) {
            Categories category = categoryService.getCategoryById(categoryId.get());
            List<Products> productsList = productService.getProductsByCategory(category);
            model.addAttribute("products", productsList);
        } else {
            List<Products> productsList = productService.getAllProducts();
            model.addAttribute("products", productsList);
        }
        return "product/list";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(
            @PathVariable("id") int id,
            Model model
    ) {
        Products product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "product/detail";
    }
}

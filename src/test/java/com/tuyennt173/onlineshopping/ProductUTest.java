package com.tuyennt173.onlineshopping;

import com.tuyennt173.onlineshopping.entity.Categories;
import com.tuyennt173.onlineshopping.service.CategoryService;
import com.tuyennt173.onlineshopping.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductUTest {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @Test
    public void getAllProducts() {
        productService.getAllProducts()
                .forEach(p -> System.out.println(p.getName() + " | " + p.getCategory().getName()));
    }

    @Test
    public void getProductsByCategory() {
        Categories category = categoryService.getCategoryById("1001");
        productService.getProductsByCategory(category)
                .forEach(p -> System.out.println(p.getName() + " | " + p.getCategory().getId()));
    }

}

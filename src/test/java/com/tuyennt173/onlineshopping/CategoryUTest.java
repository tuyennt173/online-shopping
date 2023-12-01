package com.tuyennt173.onlineshopping;

import com.tuyennt173.onlineshopping.entity.Categories;
import com.tuyennt173.onlineshopping.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CategoryUTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void showAllCategories() {
        categoryService.getAllCategories().
                forEach(System.out::println);
    }

    @Test
    public void showOneCategory() {
        Categories category = categoryService.getCategoryById("1001");
        System.out.println("category = " + category);
    }

    @Test
    public void showProductsOfCategory() {
        Categories category = categoryService.getCategoryById("1001");
        category.getProducts().forEach(p -> System.out.println("p.getName() = " + p.getName()));
    }
}

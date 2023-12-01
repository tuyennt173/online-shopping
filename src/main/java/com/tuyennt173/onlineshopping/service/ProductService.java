package com.tuyennt173.onlineshopping.service;

import com.tuyennt173.onlineshopping.entity.Categories;
import com.tuyennt173.onlineshopping.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductService {

    List<Products> getAllProducts();

    Products getProductById(int id);

    List<Products> getProductsByCategory(Categories category);

}

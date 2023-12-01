package com.tuyennt173.onlineshopping.service.impl;

import com.tuyennt173.onlineshopping.entity.Categories;
import com.tuyennt173.onlineshopping.entity.Products;
import com.tuyennt173.onlineshopping.repository.ProductRepository;
import com.tuyennt173.onlineshopping.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Products getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Products> getProductsByCategory(Categories category) {
        return productRepository.findProductsByCategory(category);
    }
}

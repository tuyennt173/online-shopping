package com.tuyennt173.onlineshopping.service.impl;

import com.tuyennt173.onlineshopping.entity.Categories;
import com.tuyennt173.onlineshopping.repository.CategoryRepository;
import com.tuyennt173.onlineshopping.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Override
    public List<Categories> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Categories getCategoryById(String id) {
        return categoryRepository.findById(id).orElse(null);
    }
}

package com.tuyennt173.onlineshopping.service;

import com.tuyennt173.onlineshopping.entity.Categories;

import java.util.List;

public interface CategoryService {

    List<Categories> getAllCategories();

    Categories getCategoryById(String id);

}

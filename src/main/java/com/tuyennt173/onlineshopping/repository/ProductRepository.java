package com.tuyennt173.onlineshopping.repository;

import com.tuyennt173.onlineshopping.entity.Categories;
import com.tuyennt173.onlineshopping.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Products, Integer> {

    List<Products> findProductsByCategory(Categories category);

}

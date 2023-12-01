package com.tuyennt173.onlineshopping.repository;

import com.tuyennt173.onlineshopping.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Categories, String> {
}

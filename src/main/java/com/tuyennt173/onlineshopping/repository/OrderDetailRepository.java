package com.tuyennt173.onlineshopping.repository;

import com.tuyennt173.onlineshopping.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetails, Long> {
}

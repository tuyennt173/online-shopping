package com.tuyennt173.onlineshopping.repository;

import com.tuyennt173.onlineshopping.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Orders, Long> {

    @Query(
            value = "SELECT o FROM Orders o " +
                    "WHERE o.account.userName = :userName"
    )
    List<Orders> findAllOrdersByUserName(@Param("userName") String userName);

}

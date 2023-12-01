package com.tuyennt173.onlineshopping.repository;

import com.tuyennt173.onlineshopping.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Accounts, String> {
}

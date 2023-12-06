package com.tuyennt173.onlineshopping.repository;

import com.tuyennt173.onlineshopping.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Roles, String> {
}

package com.tuyennt173.onlineshopping.service;

import com.tuyennt173.onlineshopping.entity.Authorities;

import java.util.List;

public interface AuthorityService {

    List<Authorities> getAllAuthorities();

    Authorities getAuthorityById(int id);

}

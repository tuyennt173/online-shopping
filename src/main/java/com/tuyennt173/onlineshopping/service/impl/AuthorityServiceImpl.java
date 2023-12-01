package com.tuyennt173.onlineshopping.service.impl;

import com.tuyennt173.onlineshopping.entity.Authorities;
import com.tuyennt173.onlineshopping.repository.AuthorityRepository;
import com.tuyennt173.onlineshopping.service.AuthorityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorityServiceImpl implements AuthorityService {

    private AuthorityRepository authorityRepository;

    @Override
    public List<Authorities> getAllAuthorities() {
        return authorityRepository.findAll();
    }

    @Override
    public Authorities getAuthorityById(int id) {
        return authorityRepository.findById(id).orElse(null);
    }
}

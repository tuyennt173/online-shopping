package com.tuyennt173.onlineshopping.service.impl;

import com.tuyennt173.onlineshopping.entity.Accounts;
import com.tuyennt173.onlineshopping.repository.AccountRepository;
import com.tuyennt173.onlineshopping.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    @Override
    public List<Accounts> getAllAccount() {
        return accountRepository.findAll();
    }

    @Override
    public Accounts getAccountByUserName(String userName) {
        return accountRepository.findById(userName).orElse(null);
    }
}

package com.tuyennt173.onlineshopping.service;

import com.tuyennt173.onlineshopping.entity.Accounts;

import java.util.List;

public interface AccountService {

    List<Accounts> getAllAccount();

    Accounts getAccountByUserName(String userName);

}

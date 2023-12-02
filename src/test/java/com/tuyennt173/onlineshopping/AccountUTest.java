package com.tuyennt173.onlineshopping;

import com.tuyennt173.onlineshopping.entity.Accounts;
import com.tuyennt173.onlineshopping.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccountUTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void show() {
        accountService.getAllAccount()
                .forEach(accounts -> System.out.println("accounts.getFullName() = " + accounts.getFullName()));
    }

    @Test
    public void showOne() {
        Accounts account = accountService.getAccountByUserName("staff");
        System.out.println(account.getUserName() + " | " + account.getFullName());
    }
    
    @Test
    public void showRecordGetByUserName() {
        Accounts account = accountService.getAccountByUserName("customer");
        System.out.println(account.getUserName() + " | " + account.getPassword());
    }
}

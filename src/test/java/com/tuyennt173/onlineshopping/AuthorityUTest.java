package com.tuyennt173.onlineshopping;

import com.tuyennt173.onlineshopping.entity.Authorities;
import com.tuyennt173.onlineshopping.service.AuthorityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AuthorityUTest {

    @Autowired
    private AuthorityService authorityService;

    @Test
    public void showAuthorities() {
        authorityService.getAllAuthorities()
                .forEach(authortity -> System.out.println("authortity = "
                        + authortity.getAccount().getFullName() + " | " + authortity.getRole().getName()));
    }

    @Test
    public void showOneAuthority() {
        Authorities authority = authorityService.getAuthorityById(1);
        System.out.println("authority = " +
                authority.getRole().getId() + " | " + authority.getAccount().getUserName());
    }

}

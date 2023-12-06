package com.tuyennt173.onlineshopping.security;

import com.tuyennt173.onlineshopping.entity.Accounts;
import com.tuyennt173.onlineshopping.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private AccountService accountService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Accounts account = accountService.getAccountByUserName(username);
        if(account == null) {
            throw new UsernameNotFoundException("Username or password is not valid with: " + username);
        } else {

            return new CustomUserDetails(account);

//            String userName = account.getUserName();
//            String password = account.getPassword();
//            List<GrantedAuthority> authorities = account.getAuthorities().stream()
//                    .map(auth -> new SimpleGrantedAuthority(auth.getRole().getId()))
//                    .collect(Collectors.toList());
//            return new User(userName, password, authorities);
        }
    }

}

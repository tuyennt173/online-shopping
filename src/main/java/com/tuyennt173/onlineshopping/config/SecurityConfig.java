//package com.tuyennt173.onlineshopping.config;
//
//import com.tuyennt173.onlineshopping.entity.Accounts;
//import com.tuyennt173.onlineshopping.service.AccountService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//import java.util.NoSuchElementException;
//import java.util.stream.Collector;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Autowired
//    private AccountService accountService;
//
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public  configure(AuthenticationManagerBuilder managerBuilder) throws Exception {
//        managerBuilder.userDetailsService(username -> {
//            try {
//                Accounts account = accountService.getAccountByUserName(username);
//                String pwdEncode = passwordEncoder().encode(account.getPassword());
//                String[] role = account.getAuthorities().stream()
//                        .map(auth -> auth.getRole().getId())
//                        .toList().toArray(new String[0]);
//                return User.builder()
//                        .username(username)
//                        .password(pwdEncode)
//                        .roles(role)
//                        .build();
//            } catch (NoSuchElementException e) {
//                throw new UsernameNotFoundException(username + "not found");
//            }
//        });
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.csrf().disable()
//                .authorizeHttpRequests((authorize) -> {
//                    authorize.requestMatchers("/order/**").authenticated()
//                            .requestMatchers("/admin/**").hasAnyRole("STAF", "DIRE")
//                            .requestMatchers("/api/authorities").hasAnyRole("DIRE")
//                            .anyRequest().permitAll();
//                })
//                .httpBasic(Customizer.withDefaults());
//
//        httpSecurity.formLogin()
//                .loginPage("/security/login/form")
//                .loginProcessingUrl("/security/login")
//                .defaultSuccessUrl("/security/login/success", false)
//                .failureUrl("/security/login/failed");
//
//        httpSecurity.exceptionHandling()
//                .accessDeniedPage("/security/unauthorized");
//
//        httpSecurity.logout()
//                .logoutUrl("/security/logoff")
//                .logoutSuccessUrl("/security/logoff/success");
//
//        return httpSecurity.build();
//    }
//}

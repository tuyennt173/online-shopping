package com.tuyennt173.onlineshopping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Accounts {
    @Id
    private String userName;
    private String password;
    private String fullName;
    private String email;
    private String photo;

    @OneToMany(mappedBy = "account")
    private List<Authorities> authorities;
}

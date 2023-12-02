package com.tuyennt173.onlineshopping.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Accounts {
    @Id
    private String userName;
    private String password;
    private String fullName;
    private String email;
    private String photo;

    @OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Authorities> authorities;

}

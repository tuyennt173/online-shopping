package com.tuyennt173.onlineshopping.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Roles {
    @Id
    private String id;
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "role")
    private List<Authorities> authorities;
}

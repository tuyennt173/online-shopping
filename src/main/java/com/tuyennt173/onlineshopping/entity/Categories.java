package com.tuyennt173.onlineshopping.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Categories {
    @Id
    private String id;
    private String name;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private List<Products> products;
}

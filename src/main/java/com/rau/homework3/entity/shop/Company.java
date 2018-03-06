package com.rau.homework3.entity.shop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    private String id;

    private String name;

    private List<Branch> branches;

    private String imageUrl;

    private String description;

    // Products that all branches have
    private List<Product> products;
}


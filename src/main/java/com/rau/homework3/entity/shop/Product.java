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
public class Product {

    private String id;

    private String name;

    private String description;

    private String imageUrl;

    private List<String> categories;

    private float price;
}

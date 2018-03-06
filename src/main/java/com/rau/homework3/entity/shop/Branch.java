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
public class Branch {

    private String id;

    private String name;

    private Address address;

    private List<String> phoneNumbers;

    private float deliveryPrice;

    private List<WorkingHours> workingHours;

    // Products that specified for this branch
    private List<Product> moreProducts;

}

package com.rau.homework3.entity.shop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private float latitude;

    private float longitude;

    private String country;

    private String city;

    private String street;

    private String building;

    private String apartment;
}

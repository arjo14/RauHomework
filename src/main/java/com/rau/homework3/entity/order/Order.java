package com.rau.homework3.entity.order;

import com.rau.homework3.entity.shop.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private List<OrderItem> orderItems;

    private String phone;

    private Address addressInfo;
}

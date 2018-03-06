package com.rau.homework3.entity.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    private String companyId;

    private String branchId;

    private String productId;

    private int count;

    private String comment;
}

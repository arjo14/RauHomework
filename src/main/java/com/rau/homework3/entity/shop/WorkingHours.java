package com.rau.homework3.entity.shop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WorkingHours {

    private int dayOfWeek;

    private String openTime;

    private String closeTime;
}

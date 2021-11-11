package com.tms.car_information;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FuelTank {
    private double capacity;
    private double fuel;

    public FuelTank(double capacity) {
        this.capacity = capacity;
    }
}

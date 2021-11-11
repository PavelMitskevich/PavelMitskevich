package com.tms.car_information;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }
}

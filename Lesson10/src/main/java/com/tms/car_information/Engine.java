package com.tms.car_information;

import lombok.Setter;

@Setter
public class Engine implements EngineAware {
    String engine;

    @Override
    public String getEngine() {
        return engine;
    }

    public Engine(String engine) {
        this.engine = engine;
    }

    @Override
    public String showInfo() {
        return EngineAware.super.showInfo();
    }
}

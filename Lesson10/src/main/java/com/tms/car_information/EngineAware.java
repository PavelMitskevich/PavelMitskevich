package com.tms.car_information;

public interface EngineAware {
    String engine = null;

    default String getEngine() {
        return engine;
    }

    default String showInfo() {
        return "engine = " + getEngine();
    }
}

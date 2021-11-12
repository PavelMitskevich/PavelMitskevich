package com.tms.car_information;

public class EngineAwareImpl implements EngineAware {
    private final Engine engine;
    private boolean flagStart;

    public EngineAwareImpl(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean start() {
        flagStart = !flagStart;
        return flagStart;
    }

    @Override
    public boolean stop() {
        return flagStart = false;
    }
}

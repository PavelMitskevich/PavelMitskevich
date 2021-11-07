package com.tms.car_information;

public interface FuelTankAware {
    double getCapacity();

    default String showInfo() {
        return "fuel tank capacity = " + getCapacity();
    }

    void showDistance();

    void showFuel();

    void gasStation(int fuelFromGasStation);

    void start();

    void carIsDriving();

    void stop();
}

package com.tms.car_information;

public interface FuelTankAware {
    double getCapacity();

    double getDistance();

    double getFuelLevel();

    void gasStation(int fuelFromGasStation);

    boolean start();

    void setDistance(double distance);

    void reductionFuel();

    void increaseDistance();
}

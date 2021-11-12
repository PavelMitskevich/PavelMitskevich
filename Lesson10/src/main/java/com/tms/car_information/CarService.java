package com.tms.car_information;

public interface CarService {
    void showDistance();

    void showInfo();

    void showFuel();

    void reFuel(int fuelFromGasStation);

    void startEngine();

    void carIsDriving();

    void stopEngine();
}

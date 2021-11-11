package com.tms.car_information;

import model.Car;

public class CarServiceImpl implements CarService {
    private final Car car;
    private final EngineAware engineAware;
    private final FuelTankAware fuelTankAware;
    private boolean flagStart;

    public CarServiceImpl(Car car) {
        this.car = car;
        this.engineAware = new EngineAwareImpl(car.getEngine());
        this.fuelTankAware = new FuelTankAwareImpl(car.getFuelTank());
    }

    @Override
    public void showDistance() {
        System.out.println("Distance = " + fuelTankAware.getDistance());
    }

    @Override
    public void showInfo() {
        System.out.println(car);
    }

    @Override
    public void showFuel() {
        System.out.println("Fuel in gas tank = " + fuelTankAware.getFuelLevel());
    }

    @Override
    public void reFuel(int fuelFromGasStation) {
        fuelTankAware.gasStation(fuelFromGasStation);
    }

    @Override
    public void startEngine() {
        if (!fuelTankAware.start()) {
            if (engineAware.start()) {
                System.out.println("Engine started");
                flagStart = true;
            } else {
                System.out.println("You can't twice started engine, please please turn off the engine");
            }
        } else {
            System.out.println("Fuel tank is empty, car can't started");
        }
    }

    @Override
    public void carIsDriving() {
        if (flagStart) {
            System.out.println(car.getModel() + " is driving");
            fuelTankAware.reductionFuel();
        } else {
            System.out.println("Engine isn't started, car can't driving");
        }
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped" + " Fuel: " + fuelTankAware.getFuelLevel() + " Distance: " + fuelTankAware.getDistance());
        engineAware.stop();
    }
}

package com.tms.car_information;

public class FuelTankAwareImpl implements FuelTankAware {
    private final FuelTank fuelTank;
    private boolean flagFuel;
    private double distance;

    public FuelTankAwareImpl(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    @Override
    public double getCapacity() {
        return fuelTank.getCapacity();
    }

    @Override
    public double getDistance() {
        return this.distance;
    }

    @Override
    public double getFuelLevel() {
        return fuelTank.getFuel();
    }

    @Override
    public void reductionFuel() {
        if (fuelTank.getFuel() <= 6 && fuelTank.getFuel() >= 0) {
            setDistance(getDistance() + fuelTank.getFuel() * 10);
            fuelTank.setFuel(0);
        } else {
            fuelTank.setFuel(fuelTank.getFuel() - 6);
            increaseDistance();
        }
    }

    @Override
    public void increaseDistance() {
        setDistance(getDistance() + 60);
    }

    @Override
    public void gasStation(int fuelFromGasStation) {
        if (fuelTank.getFuel() + fuelFromGasStation > getCapacity()) {
            fuelTank.setFuel(getCapacity());
        } else {
            fuelTank.setFuel(fuelTank.getFuel() + fuelFromGasStation);
        }
        if (fuelTank.getFuel() > 0) {
            flagFuel = false;
        }
        System.out.println("Refuel the car = " + fuelTank.getFuel());
    }

    @Override
    public boolean start() {
        flagFuel = fuelTank.getFuel() == 0;
        return flagFuel;
    }

    @Override
    public void setDistance(double distance) {
        this.distance = distance;
    }
}

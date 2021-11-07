package com.tms.car_information;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FuelTank implements FuelTankAware {
    private double capacity;
    private double fuel;
    private boolean flagFuel;
    private double distance;
    private boolean flagStart = true;

    @Override
    public double getCapacity() {
        return capacity;
    }

    public FuelTank(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String showInfo() {
        return FuelTankAware.super.showInfo();
    }

    public void showDistance() {
        System.out.println("Distance = " + distance);
    }

    public void showFuel() {
        System.out.println("Fuel in gas tank = " + fuel);
    }

    public void gasStation(int fuelFromGasStation) {
        if (fuel + fuelFromGasStation > getCapacity()) {
            this.fuel = getCapacity();
        } else {
            fuel += fuelFromGasStation;
        }
        if (fuel > 0) {
            flagFuel = false;
        }
        System.out.println("Refuel the car = " + this.fuel);
    }

    public void start() {
        if (fuel == 0) {
            flagFuel = true;
        }
        if (!flagFuel) {
            if (flagStart) {
                System.out.println("Engine started");
                flagStart = false;
            } else {
                System.out.println("You can't twice started engine, please please turn off the engine");
            }
        } else {
            System.out.println("Fuel tank is empty, car can't started");
        }
    }

    public void carIsDriving() {
        if (!flagStart && !flagFuel) {
            System.out.println("Car is driving");
            if (fuel <= 6 && fuel >= 0) {
                distance += fuel * 10;
                fuel = 0;
                flagFuel = true;
            } else {
                fuel -= 6;
                distance += 60;
            }
        } else {
            System.out.println("Engine isn't started, car can't driving");
        }
    }

    public void stop() {
        System.out.println("Engine stopped" + " Fuel: " + fuel + " Distance: " + distance);
        flagStart = true;
    }
}

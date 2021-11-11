package model;

import com.tms.car_information.Engine;
import com.tms.car_information.FuelTank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car {
    private final Engine engine;
    private FuelTank fuelTank;
    private String model;
    private int year;

    public Car(Engine engine, FuelTank fuelTank, String model, int year) {
        this.engine = engine;
        this.fuelTank = fuelTank;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine.getType() +
                ", fuelTank=" + fuelTank.getCapacity() +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

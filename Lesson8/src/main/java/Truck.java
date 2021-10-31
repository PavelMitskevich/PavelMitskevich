import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Truck extends Terrestrial {
    private double liftingCapacity;

    public Truck(double power, double maxSpeed, double mass, String model, int countWheels, double fuelConsumption, double liftingCapacity) {
        super(power, maxSpeed, mass, model, countWheels, fuelConsumption);
        setLiftingCapacity(liftingCapacity);
    }

    public String showInfo() {
        return "Model = " + getModel() + ", lifting capacity = " + getLiftingCapacity() + ", power = " + getPower() + ", power in kW = " + getPower() * 0.74 + ", max speed = " + getMaxSpeed()
                + ", mass = " + getMass() + ", fuel consumption = " + getFuelConsumption() + ", count of wheels = " + getCountWheels();
    }

    public void loadingPossibility(double cargo) {
        if (cargo <= getLiftingCapacity()) {
            System.out.println("Truck is loaded");
        } else {
            System.out.println("You need bigger truck");
        }
    }
}

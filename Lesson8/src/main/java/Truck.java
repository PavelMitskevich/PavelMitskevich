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

    @Override
    public String showInfo() {
        return super.showInfo() + ", lifting capacity = " + getLiftingCapacity();
    }

    public void loadingPossibility(double cargo) {
        if (getLiftingCapacity() >= cargo) {
            System.out.println("Truck is loaded");
        } else {
            System.out.println("You need bigger truck");
        }
    }
}

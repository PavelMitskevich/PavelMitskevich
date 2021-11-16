import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Terrestrial extends Transport {
    private int countWheels;
    private double fuelConsumption;

    public Terrestrial(double power, double maxSpeed, double mass, String model, int countWheels, double fuelConsumption) {
        super(model, power, maxSpeed, mass);
        this.countWheels = countWheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + ", count of wheels = " + getCountWheels() + ", fuel consumption = " + getFuelConsumption();
    }
}

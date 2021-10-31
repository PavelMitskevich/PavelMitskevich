import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Terrestrial extends Transport {
    private int countWheels;
    private double fuelConsumption;

    public Terrestrial(double power, double maxSpeed, double mass, String model, int countWheels, double fuelConsumption) {
        super(power, maxSpeed, mass, model);
        setCountWheels(countWheels);
        setFuelConsumption(fuelConsumption);
    }
}

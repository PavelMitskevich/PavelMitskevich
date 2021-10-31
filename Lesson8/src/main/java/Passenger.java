import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Passenger extends Terrestrial {
    private String bodyType;
    private int countPassages;
    private double distance;

    public Passenger(double power, double maxSpeed, double mass, String model, int countWheels, double fuelConsumption, String bodyType, int countPassages) {
        super(power, maxSpeed, mass, model, countWheels, fuelConsumption);
        setBodyType(bodyType);
        setCountPassages(countPassages);
    }

    public String showInfo() {
        return "Model = " + getModel() + ", body type = " + getBodyType() + ", power = " + getPower() + ", power in kW = " + getPower() * 0.74 + ", max speed = " + getMaxSpeed()
                + ", mass = " + getMass() + ", fuel consumption = " + getFuelConsumption() + ", count of wheels = " + getCountWheels();
    }


    public String distance(double time) {
        distance = getMaxSpeed() * time;
        return "For time " + time + " h, auto " + getModel() + " moving at maximum speed " + getMaxSpeed() + " km/h, will pass " + distance + " km, and will consume " + showFuel();
    }

    private String showFuel() {
        double fuel = distance * getFuelConsumption() / 100;
        return fuel + " liters of fuel.";
    }

}

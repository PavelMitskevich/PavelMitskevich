import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Passenger extends Terrestrial {
    private String bodyType;
    private int countPassages;
    private double distance;
    private double fuel;

    public Passenger(double power, double maxSpeed, double mass, String model, int countWheels, double fuelConsumption, String bodyType, int countPassages) {
        super(power, maxSpeed, mass, model, countWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.countPassages = countPassages;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + ", body type = " + getBodyType() + ", count of passages = " + getCountPassages();
    }

    public String distance(double time) {
        distance = getMaxSpeed() * time;
        return "For time " + time + " h, auto " + getModel() + " moving at maximum speed " + getMaxSpeed() + " km/h, will pass " + distance + " km, and will consume " + showFuel() + " liters of fuel.";
    }

    private double showFuel() {
        return fuel = distance * getFuelConsumption() / 100;
    }
}

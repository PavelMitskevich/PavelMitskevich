import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Transport {
    private double power;
    private double maxSpeed;
    private double mass;
    private String model;

    public Transport(double power, double maxSpeed, double mass, String model) {
        setPower(power);
        setMaxSpeed(maxSpeed);
        setMass(mass);
        setModel(model);
    }
}

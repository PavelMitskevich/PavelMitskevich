import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Transport {
    private String model;
    private double power;
    private double maxSpeed;
    private double mass;

    public String showInfo() {
        return "Model = " + getModel() + ", power = " + getPower() + ", power in kW = " + getPower() * 0.74 + ", max speed = " + getMaxSpeed()
                + ", mass = " + getMass();
    }
}

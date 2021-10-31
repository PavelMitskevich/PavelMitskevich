import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Air extends Transport {
    private double wingspan;
    private double minRunwayLength;

    public Air(double power, double maxSpeed, double mass, String model, double wingspan, double minRunwayLength) {
        super(power, maxSpeed, mass, model);
        setWingspan(wingspan);
        setMinRunwayLength(minRunwayLength);
    }


}

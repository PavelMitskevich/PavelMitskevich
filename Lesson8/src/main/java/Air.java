import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Air extends Transport {
    private double wingspan;
    private double minRunwayLength;

    public Air(String model, double power, double maxSpeed, double mass, double wingspan, double minRunwayLength) {
        super(model, power, maxSpeed, mass);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + ", wingspan = " + getWingspan() + ", min runway length = " + getMinRunwayLength();
    }
}

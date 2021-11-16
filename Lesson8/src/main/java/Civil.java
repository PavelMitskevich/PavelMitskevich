import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Civil extends Air {
    private int countPassages;
    private boolean availabilityBusinessClass;

    public Civil(String model, double power, double maxSpeed, double mass, double wingspan, double minRunwayLength, int countPassages, boolean availabilityBusinessClass) {
        super(model, power, maxSpeed, mass, wingspan, minRunwayLength);
        this.countPassages = countPassages;
        this.availabilityBusinessClass = availabilityBusinessClass;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + ", count of passages = " + getCountPassages() + ", business class = " + availabilityBusinessClass;
    }

    public void loadingPossibility(int quantityPassages) {
        if (getCountPassages() >= quantityPassages) {
            System.out.println("Civil plane is loaded");
        } else {
            System.out.println("You need bigger civil plane");
        }
    }
}

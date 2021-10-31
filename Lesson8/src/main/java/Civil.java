import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Civil extends Air {
    private int countPassages;
    private boolean availabilityBusinessClass;

    public Civil(double power, double maxSpeed, double mass, String model, double wingspan, double minRunwayLength, int countPassages, boolean availabilityBusinessClass) {
        super(power, maxSpeed, mass, model, wingspan, minRunwayLength);
        setCountPassages(countPassages);
        setAvailabilityBusinessClass(availabilityBusinessClass);
    }

    public String showInfo() {
        return "Model = " + getModel() + ", wingspan = " + getWingspan() + ", min runway length = " + getMinRunwayLength() + ", power = " + getPower() + ", power in kW = " + getPower() * 0.74
                + ", max speed = " + getMaxSpeed() + ", mass = " + getMass() + ", count of passages = " + getCountPassages() + ", business class = " + availabilityBusinessClass;
    }

    public void loadingPossibility(int quantityPassages){
        if (quantityPassages<=getCountPassages()){
            System.out.println("Civil plane is loaded");
        }else {
            System.out.println("You need bigger civil plane");
        }
    }
}

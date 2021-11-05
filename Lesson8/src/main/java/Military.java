import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Military extends Air {
    private boolean ejectionSystem;
    private int numberMissilesBoard;

    public Military(String model, double power, double maxSpeed, double mass, double wingspan, double minRunwayLength, boolean ejectionSystem, int numberMissilesBoard) {
        super(model, power, maxSpeed, mass, wingspan, minRunwayLength);
        this.ejectionSystem = ejectionSystem;
        this.numberMissilesBoard = numberMissilesBoard;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + ", count of missiles on a board = " + getNumberMissilesBoard() + ", ejection system = " + ejectionSystem;
    }

    public void shot() {
        if (numberMissilesBoard > 0) {
            System.out.println("The rocket went...");
            numberMissilesBoard--;
        } else {
            System.out.println("No ammunition");
        }
    }

    public void isEjectionSystem() {
        if (ejectionSystem) {
            System.out.println("The bailout was successful");
            ejectionSystem = false;
        } else {
            System.out.println("You don’t have such a system");
        }
    }
}

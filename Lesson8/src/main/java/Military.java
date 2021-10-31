import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Military extends Air {
    private boolean ejectionSystem;
    private int numberMissilesBoard;

    public Military(double power, double maxSpeed, double mass, String model, double wingspan, double minRunwayLength, int numberMissilesBoard, boolean ejectionSystem) {
        super(power, maxSpeed, mass, model, wingspan, minRunwayLength);
        setEjectionSystem(ejectionSystem);
        setNumberMissilesBoard(numberMissilesBoard);
    }

    public String showInfo() {
        return "Model = " + getModel() + ", wingspan = " + getWingspan() + ", min runway length = " + getMinRunwayLength() + ", power = " + getPower() + ", power in kW = " + getPower() * 0.74
                + ", max speed = " + getMaxSpeed() + ", mass = " + getMass() + ", quantity of missiles on a board = " + getNumberMissilesBoard() + ", ejection system = " + ejectionSystem;
    }

    public void shot(){
        if (numberMissilesBoard>0){
            System.out.println("The rocket went...");
            numberMissilesBoard--;
        }else {
            System.out.println("No ammunition");
        }
    }

    public void isEjectionSystem(){
        if (ejectionSystem){
            System.out.println("The bailout was successful");
        }else {
            System.out.println("You don’t have such a system");
        }
    }
}

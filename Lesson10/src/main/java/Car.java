import com.tms.car_information.EngineAware;
import com.tms.car_information.FuelTankAware;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car implements EngineAware, FuelTankAware {
    private EngineAware engineAware;
    private FuelTankAware fuelTankAware;
    private String model;
    private int year;

    @Override
    public String showInfo() {
        return getModel() + ": " + engineAware.showInfo() + ", " + fuelTankAware.showInfo() + ", year = " + getYear();
    }

    @Override
    public void showDistance() {
        fuelTankAware.showDistance();
    }

    @Override
    public void showFuel() {
        fuelTankAware.showFuel();
    }

    @Override
    public void gasStation(int fuelFromGasStation) {
        fuelTankAware.gasStation(fuelFromGasStation);
    }

    @Override
    public void start() {
        fuelTankAware.start();
    }

    @Override
    public void carIsDriving() {
        fuelTankAware.carIsDriving();
    }

    @Override
    public void stop() {
        fuelTankAware.stop();
    }

    public Car(EngineAware engineAware, FuelTankAware fuelTankAware, String model, int year) {
        this.engineAware = engineAware;
        this.fuelTankAware = fuelTankAware;
        this.model = model;
        this.year = year;
    }

    @Override
    public String getEngine() {
        return engineAware.getEngine();
    }

    @Override
    public double getCapacity() {
        return fuelTankAware.getCapacity();
    }
}

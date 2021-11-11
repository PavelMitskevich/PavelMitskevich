import com.tms.car_information.CarService;
import com.tms.car_information.CarServiceImpl;
import com.tms.car_information.Engine;
import com.tms.car_information.FuelTank;
import model.Car;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarServiceImpl(new Car(new Engine("V8"), new FuelTank(18.0), "BMW", 2012));
        carService.showInfo();
        carService.showDistance();
        carService.showFuel();
        carService.startEngine();
        carService.reFuel(155);
        carService.showFuel();
        carService.startEngine();
//        carService.startEngine();
        carService.carIsDriving();
        carService.showDistance();
        carService.showFuel();
        carService.carIsDriving();
        carService.showDistance();
        carService.showFuel();
        carService.reFuel(3);
        carService.carIsDriving();
        carService.showDistance();
        carService.showFuel();
//        carService.carIsDriving();
//        carService.showDistance();
//        carService.showFuel();
        carService.stopEngine();
        carService.startEngine();
    }
}

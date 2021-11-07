import com.tms.car_information.Engine;
import com.tms.car_information.FuelTank;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("V6");
        FuelTank fuelTank = new FuelTank(50.0);
        Car car = new Car(new Engine("V8"), new FuelTank(18.0), "BMW", 2012);
        Car car1 = new Car(engine, fuelTank, "Audi", 2005);
        System.out.println(car.showInfo());
        System.out.println(car1.showInfo());
        System.out.println("----------");
        car.showDistance();
        car.showFuel();
        car.gasStation(12);
        car.showFuel();
        car.start();
        car.carIsDriving();
        car.gasStation(11);
        car.carIsDriving();
        car.stop();
    }
}

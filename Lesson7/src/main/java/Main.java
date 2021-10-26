public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engine("V8"), new GasTank(40), "BMW", 2000);
        car.start();
        car.showDistance();
        car.showFuel();
        car.gasStation(60);
        car.start();
        car.carIsDriving();
        car.start();
        car.showFuel();
        car.gasStation(8);
        car.carIsDriving();
        car.carIsDriving();
        car.stop();
        car.showInfo();
        System.out.println("----------------");
    }
}

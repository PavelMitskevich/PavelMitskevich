public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//        car.showDistance();
//        car.showFuel();
//        car.start();
//        car.gasStation(60);
//        car.start();
//        car.showInfo();
//        System.out.println("----------------");
        Car car1 = new Car();
        car1 = new Car(car1.new Engine("V8"), car1.new GasTank(50));
        car1.gasStation(220);
        car1.start();
        car1.setModel("BMW");
        car1.setYear(2005);
        car1.showInfo();

    }
}

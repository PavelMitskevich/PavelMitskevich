public class Main {
    public static void main(String[] args) {

        Passenger passenger = new Passenger(120, 200.6, 2500, "Audi", 4, 6, "Sedan", 5);
        System.out.println(passenger.showInfo());
        System.out.println(passenger.distance(2.5));
        System.out.println("---------");
        Truck truck = new Truck(260.8, 115.3, 10560.9, "MANN", 10, 11.5, 30000);
        System.out.println(truck.showInfo());
        truck.loadingPossibility(15000);
        System.out.println("---------");
        Civil civil = new Civil("Boing", 750.5, 700, 15000, 7.5, 780.3, 78, true);
        System.out.println(civil.showInfo());
        civil.loadingPossibility(55);
        System.out.println("---------");
        Military military = new Military("T-50", 2050.3, 5500.4, 3000, 5.5, 330.3, true, 2);
        System.out.println(military.showInfo());
        military.shot();
        military.shot();
        military.shot();
        military.isEjectionSystem();
        military.isEjectionSystem();

    }
}

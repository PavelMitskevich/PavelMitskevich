public class Car {
    private Engine engine;
    private GasTank gasTank;
    private String model;
    private int year;

    private double fuel;
    private double distance = 0;
    private boolean flagStart = true;
    private boolean flagFuel;

    public Car(Engine engine, GasTank gasTank, String model, int year) {
        this.engine = engine;
        this.gasTank = gasTank;
        this.model = model;
        this.year = year;
        setModel(model);
        setYear(year);

    }

    public void showInfo() {
        System.out.printf("Car: %s, year: %d, engine: %s, gas tank: %f %n", getModel(), getYear(), engine.getEngine(), gasTank.getCapacity());
    }

    private String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!model.trim().isEmpty()) {
            this.model = model;
        } else {
            System.out.println("Incorrect model");
        }
    }

    private int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1990) {
            this.year = year;
        } else {
            System.out.println("Incorrect year");
        }
    }

    public void showDistance() {
        System.out.println("Distance = " + distance);
    }

    public void showFuel() {
        System.out.println("Fuel in gas tank = " + fuel);
    }

    public void gasStation(int fuelFromGasStation) {
        if (fuel + fuelFromGasStation > gasTank.getCapacity()) {
            this.fuel = gasTank.getCapacity();
        }else {
            fuel+=fuelFromGasStation;
        }
        if (fuel > 0) {
            flagFuel = false;
        }
        System.out.println("Refuel the car = " + this.fuel);
    }

    public void start() {
        if (fuel == 0) {
            flagFuel = true;
        }
        if (!flagFuel) {
            if (flagStart) {
                System.out.println("Engine started");
                flagStart = false;
            } else {
                System.out.println("You can't twice started engine, please please turn off the engine");
            }
        } else {
            System.out.println("Fuel tank is empty, car can't started");
        }
    }

    public void carIsDriving() {
        if (!flagStart) {
            System.out.println("Car is driving");
            if (fuel < 6) {
                distance += fuel * 10 - 60;
                fuel = 0;
                flagFuel = true;
            } else {
                fuel -= 6;
                distance += 60;
            }
        } else {
            System.out.println("Engine isn't started, car can't driving");
        }
    }

    public void stop() {
        System.out.println("Engine stopped" + " Fuel: " + fuel + " Distance: " + distance);
        flagStart = true;
    }
}
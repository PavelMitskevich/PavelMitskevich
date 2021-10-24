public class Car {
    Engine engine = new Engine("V6");
    GasTank gasTank = new GasTank(40);
    private String model = "Audi";
    private int year = 2001;

    private double fuel;
    private double distance = 0;
    private boolean flagStart;
    private boolean flagFuel;

    Car() {
        setModel(model);
        setYear(year);
    }

    public Car(Engine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
        setModel(model);
        setYear(year);
    }

    public void showInfo() {
        System.out.printf("Car: %s, year: %d, engine: %s, gas tank: %d %n", getModel(), getYear(), engine.engine, gasTank.capacity);
    }


    private String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!model.trim().isEmpty()) {
            this.model = model;
        } else {
            System.out.println("Incorrect model");
            this.model = "Audi";
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
            this.year = 1991;
        }
    }

    public class Engine {
        public String engine;

        Engine(String engine) {
            this.engine = engine;
        }
    }

    public class GasTank {
        public int capacity;

        GasTank(int capacity) {
            this.capacity = capacity;
        }

    }

    public void showDistance() {
        System.out.println("Distance = " + distance);
    }

    public void showFuel() {
        System.out.println("Fuel in gas tank = " + fuel);
    }

    public int gasStation(int fuel) {
        this.fuel = fuel;
        distance = 60;
        if (fuel > gasTank.capacity) {
            this.fuel = gasTank.capacity;
        }
        if (fuel > 0) {
            flagFuel = false;
        }
        System.out.println("Refuel the car = " + this.fuel);
        return (int) this.fuel;
    }

    public void start() {
        if (fuel == 0) {
            flagFuel = true;
        }
        if (!flagFuel) {
            System.out.println("Engine started");
            flagStart = false;
            carIsDriving();
        } else {
            System.out.println("Fuel tank is empty, car can't started");
        }
    }

    public void stop() {
        if (fuel < 6) {
            distance += fuel * 10 - 60;
            fuel = 0;
            flagFuel = true;
            System.out.println("Engine stopped" + " Fuel: " + fuel + " Distance: " + distance);
        } else {
            fuel -= 6;
            System.out.println("Engine stopped" + " Fuel: " + fuel + " Distance: " + distance);
            distance += 60;
        }
        flagStart = true;
        start();
    }

    public void carIsDriving() {
        if (flagStart) {
            System.out.println("Engine isn't started, car can't driving");
        } else {
            System.out.println("Car is driving");
        }
        stop();
    }

}

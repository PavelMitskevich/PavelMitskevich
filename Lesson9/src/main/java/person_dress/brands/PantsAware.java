package person_dress.brands;

public interface PantsAware {
    String brand = null;

    default String getBrand() {
        return brand;
    }

    default String putOn() {
        return "Put on " + getBrand() + " pants. ";
    }

    default String takeOff() {
        return "Take off " + getBrand() + " pants. ";
    }
}

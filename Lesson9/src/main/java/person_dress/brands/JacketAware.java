package person_dress.brands;

public interface JacketAware {
    String brand = null;

    default String getBrand() {
        return brand;
    }

    default String putOn() {
        return "Put on " + getBrand() + " jacket. ";
    }

    default String takeOff() {
        return "Take off " + getBrand() + " jacket. ";
    }
}

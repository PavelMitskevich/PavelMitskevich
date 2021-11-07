package person_dress.brands;

public interface ShoesAware {
    String brand = null;

    default String getBrand() {
        return brand;
    }

    default String putOn() {
        return "Put on " + getBrand() + " shoes. ";
    }

    default String takeOff() {
        return "Take off " + getBrand() + " shoes. ";
    }
}

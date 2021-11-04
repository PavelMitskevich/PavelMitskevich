package personDress.brands;

public interface ClothesAware {
    default String putOn() {
        return "Put on ";
    }

    default String takeOff() {
        return "Take off ";
    }
}

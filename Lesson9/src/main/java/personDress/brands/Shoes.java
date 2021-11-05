package personDress.brands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Shoes implements ClothesAware {
    private String brand;

    @Override
    public String putOn() {
        return ClothesAware.super.putOn() + getBrand() + " shoes.";
    }

    @Override
    public String takeOff() {
        return ClothesAware.super.takeOff() + getBrand() + " shoes.";
    }
}

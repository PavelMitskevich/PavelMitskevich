package personDress.brands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Pants implements ClothesAware {
    private String brand;

    @Override
    public String putOn() {
        return ClothesAware.super.putOn() + getBrand() + " pants. ";
    }

    @Override
    public String takeOff() {
        return ClothesAware.super.takeOff() + getBrand() + " pants. ";
    }
}
package person_dress.brands;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Shoes implements ShoesAware {
    private String brand;

    @Override
    public String getBrand() {
        return brand;
    }
}

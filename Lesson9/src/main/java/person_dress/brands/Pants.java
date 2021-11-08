package person_dress.brands;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Pants implements PantsAware {
    private String brand;

    @Override
    public String getBrand() {
        return brand;
    }
}
package person_dress.brands;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Jacket implements JacketAware {
    private String brand;

    @Override
    public String getBrand() {
        return brand;
    }
}
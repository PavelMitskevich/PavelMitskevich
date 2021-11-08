package person_dress;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import person_dress.brands.JacketAware;
import person_dress.brands.PantsAware;
import person_dress.brands.ShoesAware;

@Getter
@Setter
@SuperBuilder
public class Person implements JacketAware, PantsAware, ShoesAware {
    private String name;
    private String brand;
    private JacketAware jacketAware;
    private PantsAware pantsAware;
    private ShoesAware shoesAware;

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String putOn() {
        return jacketAware.putOn() + pantsAware.putOn() + shoesAware.putOn();
    }

    @Override
    public String takeOff() {
        return jacketAware.takeOff() + pantsAware.takeOff() + shoesAware.takeOff();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", jacket=" + jacketAware.getBrand() +
                ", pants=" + pantsAware.getBrand() +
                ", shoes=" + shoesAware.getBrand() +
                '}';
    }
}

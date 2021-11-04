package personDress;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import personDress.brands.ClothesAware;
import personDress.brands.Jacket;
import personDress.brands.Pants;
import personDress.brands.Shoes;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
public class PersonDress implements ClothesAware {
    String name;
    Jacket jacket;
    Pants pants;
    Shoes shoes;

    @Override
    public String putOn() {
        return jacket.putOn() + pants.putOn() + shoes.putOn();
    }

    @Override
    public String takeOff() {
        return jacket.takeOff() + pants.takeOff() + shoes.takeOff();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", jacket=" + jacket.getBrand() +
                ", pants=" + pants.getBrand() +
                ", shoes=" + shoes.getBrand() +
                '}';
    }
}

package person_dress;

import person_dress.brands.Jacket;
import person_dress.brands.Pants;
import person_dress.brands.Shoes;

public class Main {
    public static void main(String[] args) {
        Jacket jacket = new Jacket("House");
        Pants pants = new Pants("Calliope");
        Shoes shoes = new Shoes("Nike");
        Person person = Person.builder()
                .name("Alex")
                .jacketAware(jacket)
                .pantsAware(pants)
                .shoesAware(shoes)
                .build();
        System.out.println(person);
        System.out.println(person.putOn());
        System.out.println(person.takeOff());
    }
}

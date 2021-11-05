package personDress;

import personDress.brands.Jacket;
import personDress.brands.Pants;
import personDress.brands.Shoes;

public class Main {
    public static void main(String[] args) {
        PersonDress alex = new PersonDress("Alex", new Jacket("Armani"), new Pants("Jeans"), new Shoes("Reebok"));
        System.out.println(alex);
        System.out.println(alex.putOn());
        System.out.println(alex.takeOff());
        System.out.println("-------");

        PersonDress person = PersonDress.builder()
                .name("Egor")
                .jacket(new Jacket("House"))
                .pants(new Pants("Calliope"))
                .shoes(new Shoes("Nike"))
                .build();

        System.out.println(person);
        System.out.println(person.putOn());
        System.out.println(person.takeOff());
    }
}

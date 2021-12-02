package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Task4 {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2011),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));
        notNull(cars);
    }

    public static void notNull(List<Car> list) {
        list.stream()
                .filter(car -> car.getYear() > 2010)
                .map(Car::getNumber)
                .filter(Objects::nonNull)
                .filter(s -> !s.trim().equals(""))
                .forEach(System.out::println);
    }

}

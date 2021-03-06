package tasks;

import p3.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alex", "Stepanov"),
                new Person("Nikita", "Lobanov"),
                new Person("Ivan", "Ivanov"),
                new Person("Petr", "Petrov"),
                new Person("Pavel", "Pavlov"),
                new Person("Petr", "Dronov"),
                new Person("Dmitriy", "Dmitiev"));

        surnameFromD(people);
        countFemales(people);
    }

    public static void surnameFromD(List<Person> people) {
        people.stream()
                .filter(person -> person.getSurname().startsWith("D"))
                .forEach(System.out::println);
    }

    public static void countFemales(List<Person> people) {
        Map<String, Long> personByFirstLetterOfFemale = people.stream()
                .collect(Collectors.groupingBy(person -> person.getSurname().substring(0, 1), Collectors.counting()));
        System.out.println(personByFirstLetterOfFemale);
    }
}

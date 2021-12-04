package tasks;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        upperFirstLetter();
    }

    public static void upperFirstLetter() {
        List<String> list = List.of("john", "arya", "sansa");
        list.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .forEach(System.out::println);
    }
}

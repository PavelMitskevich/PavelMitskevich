package tasks;

import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        printDouble();
    }

    public static void printDouble() {
        IntStream.of(15, 20, 30, 61, -1)
                .limit(7)
                .map(x -> x * 2)
                .forEach(System.out::println);
    }
}

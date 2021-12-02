package tasks;

import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        countEvenNumbers();
    }

    public static void countEvenNumbers() {
        Random random = new Random();
        Set<Integer> integerSet = Stream
                .generate(() -> random.nextInt(101))
                .distinct()
                .limit(10)
                .collect(Collectors.toSet());
        System.out.println(integerSet);
        long count = integerSet.stream()
                .filter(integer -> integer % 2 == 0)
                .count();
        System.out.println(count);

    }

}

import java.util.Random;
import java.util.Scanner;

public class Lesson3_Homework {
    public static void main(String[] args) {
        printArray();
        System.out.println();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(operation(-5));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6, 9, 11, 12}));
        countDevs(19);
        foobar(6);
        foobar(10);
        foobar(15);
        calculateSumOfDiagonalElements();
        printMatrix();
        printPrimeNumbers();
    }


    private static void printArray() {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int lengthArray = in.nextInt();
        int[] array = new int[lengthArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) - 5;
            System.out.print(array[i] + " ");
        }
    }

    public static int operation(int number) {
        if (number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }
        return number;
    }

    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 1 && ints[i] % 2 == -1) {
                count++;
            }
        }
        return count;
    }

    public static void countDevs(int count) {
        if (count % 10 == 1 && count % 100 != 11) {
            System.out.println(count + " программист");
        } else if (count % 10 > 1 && count % 10 < 5 && count % 100 < 5 && count % 100 > 21) {
            System.out.println(count + " программиста");
        } else {
            System.out.println(count + " программистов");
        }
    }

    public static void foobar(int number) {
        if (number % 3 == 0 && number % 5 != 0) {
            System.out.println("foo");
        } else if (number % 5 == 0 && number % 3 != 0) {
            System.out.println("bar");
        } else if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("foobar");
        }
    }

    public static void calculateSumOfDiagonalElements() {
        Random random = new Random();
        int[][] array = new int[3][3];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
                if (i == j) {
                    sum += array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Сумма элементов по диагонали = " + sum);
    }


    public static void printMatrix() {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int[][] array = new int[num1][num2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
//                System.out.print(array[i][j] + " ");
                if (array[i][j] % 3 == 0) {
                    System.out.print("+ ");
                } else if (array[i][j] % 7 == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void printPrimeNumbers() {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
            count = 0;
        }
    }
}

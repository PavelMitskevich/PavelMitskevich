public class Lesson2_Homework {
    public static int sum(int a, int b) {
        int summa = a + b;
        long summa1 = (long) a + (long) b;
        if (summa1 > (long) 2147483647) {
            return -1;
        }
        return summa;
    }

    public static int max(int a, int b) {
        return Math.max(a,b);
    }

    public static double average(int[] array) {
        int sum = 0;
        int i = 0;
        for (int a : array) {
            sum += a;
            i++;
        }
        double average = (double) sum / i;
        return average;
    }

    public static int max(int[] array) {
        int i = 0;
        int maximum = array[i];
        for (; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        return maximum;
    }

    public static double calculateHypotenuse(int a, int b) {
        double hypotenuse = Math.pow((Math.pow(a, 2) + Math.pow(b, 2)), 0.5);
        return hypotenuse;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 5));
        System.out.println(sum(Integer.MAX_VALUE, 5));
        System.out.println(max(5, 10));
        System.out.println(max(6, 6));
        System.out.println(average(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(max(new int[]{1, 2, 30, 4, 45, 6}));
        System.out.println(calculateHypotenuse(3, 4));
    }
}

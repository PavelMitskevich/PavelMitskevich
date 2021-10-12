import java.util.Arrays;
import java.util.Random;

public class MaxToNull {
    public static void main(String[] args) {
        massive();
    }

    public static void massive() {
        Random random = new Random();
        int[] array = new int[10];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(max);
        for (int i = 0; i < array.length; i++) {
            if (max == array[i]) {
                int temp = array[i];
                array[i] = array[0];
                array[0] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

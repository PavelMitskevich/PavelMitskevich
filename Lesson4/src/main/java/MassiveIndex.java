import java.util.Arrays;
import java.util.Random;

public class MassiveIndex {
    public static void main(String[] args) {
        maxIndex();
    }

    public static void maxIndex() {
        int[] array = new int[12];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                a = i;
            }
        }
        System.out.println("Максимальный элемент " + max + ", индекс его последнего вхождения в массив = " + a);
    }
}

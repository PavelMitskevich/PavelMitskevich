import java.util.Arrays;
import java.util.Random;

public class RepeatElements {
    public static void main(String[] args) {
        massive();
    }

    public static void massive() {
        int[] array = new int[8];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                    if (count > 0) {
                        System.out.println("Массив имеет повторяющиеся элементы " + array[j]);
                        break;
                    } else {
                        System.out.print("Массив не имеет повторяющихся элементов");
                        return;
                    }
                }
            }
        }
    }
}

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        mirrorArray();
    }

    public static void mirrorArray() {
        int[] array = new int[50];
        int a = 1;
        int temp;
        for (int i = 0; i < array.length; i++) {
            array[i] = a;
            a += 2;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length / 2; ) {
            for (int j = array.length - 1; j > array.length / 2 - 1; j--) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

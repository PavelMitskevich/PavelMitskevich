import java.util.Random;
import java.util.Scanner;

public class MatrixSquare {
    public static void main(String[] args) {
        matrix();
    }

    public static void matrix() {
        System.out.println("Введите размер квадратной матрицы: ");
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int length = in.nextInt();
        int[][] array = new int[length][length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int temp;
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j > i) {
                    temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}

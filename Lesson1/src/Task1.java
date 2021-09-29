import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        System.out.print("Введите числа: ");
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();
        String[] words = stroka.split(" ");
        for (String word:words){
            int number = Integer.parseInt(word);
            if (number>0){
                count++;
            }
        }
        System.out.println("Количество положительных чисел = "+count);
    }
}

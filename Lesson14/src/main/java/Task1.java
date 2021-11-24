import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static final String HW1 = "Lesson14/src/main/java/hw1/";

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(HW1 + "input.txt"))) {
            String value;
            while ((value = bufferedReader.readLine()) != null) {
                stringList.add(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(HW1 + "output.txt", true))) {
            for (String palindrome : isPalindromes(stringList)) {
                bufferedWriter.write(palindrome);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> isPalindromes(List<String> str) {
        List<String> palindromes = new ArrayList<>();
        for (String string : str) {
            if (string.equals(new StringBuilder(string).reverse().toString())) {
                palindromes.add(string);
            }
        }
        return palindromes;
    }
}

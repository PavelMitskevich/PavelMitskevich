import java.util.ArrayList;
import java.util.List;

public class Palindromes {
    public static List<String> isPalindromes(String[] str) {
        List<String> list = new ArrayList<>();
        for (String s : str) {
            StringBuilder stringBuilderFirstHalf = new StringBuilder();
            StringBuilder stringBuilderSecondHalf = new StringBuilder();
            char[] chars = s.toCharArray();
            for (int j = 0, k = chars.length - 1; j < chars.length / 2; j++, k--) {
                stringBuilderFirstHalf.append(chars[j]);
                stringBuilderSecondHalf.append(chars[k]);
            }
            if (stringBuilderFirstHalf.toString().equals(stringBuilderSecondHalf.toString())) {
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println((isPalindromes(new String[]{"asdsa", "afva", "ivi", "abccba"})));
        System.out.println((isPalindromes(new String[]{"заказ", "фывй", "шалаш"})));
    }
}

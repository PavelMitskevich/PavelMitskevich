public class Palindromes {
    public static void isPalindromes(String[] str) {
        for (String s : str) {
            StringBuilder stringBuilderFirstHalf = new StringBuilder();
            StringBuilder stringBuilderSecondHalf = new StringBuilder();
            char[] chars = s.toCharArray();
            for (int j = 0, k = chars.length - 1; j < chars.length / 2; j++, k--) {
                stringBuilderFirstHalf.append(chars[j]);
                stringBuilderSecondHalf.append(chars[k]);
            }
            if (stringBuilderFirstHalf.toString().equals(stringBuilderSecondHalf.toString())) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        isPalindromes(new String[]{"asdsa", "afva", "ivi", "abccba"});
        isPalindromes(new String[]{"заказ", "фывй", "шалаш"});
    }
}

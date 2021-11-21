public class Task4 {

    public static int latinWords(String str) {
        return str.split("\\s+|[А-Яа-я]+|[A-Za-z]+\\d+|\\d+").length;
    }

    public static void main(String[] args) {
        System.out.println(latinWords("One two three раз два три one1 two2 123 "));
    }
}

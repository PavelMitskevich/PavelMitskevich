public class Number {
    public static void main(String[] args) {
        number(-155);
        number(0);
        number(3857);
    }

    public static void number(int a) {
        String s;
        int count = 0;
        int num = a;
        if (a > 0) {
            s = " - это положительное число, количество цифр = ";
        } else if (a < 0) {
            s = " - это отрицательное число, количество цифр = ";
        } else {
            s = " - ноль, количество цифр = ";
        }
        while (num != 0) {
            count++;
            num = num / 10;
        }
        System.out.println(a + s + count);
    }
}

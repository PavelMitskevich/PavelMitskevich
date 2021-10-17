public class Summ {
    public static void main(String[] args) {
        summ(-4, -8);
        summ(-4, 8);
        summ(4, -8);
        summ(0, -8);
        summ(4, 0);
    }

    public static int summ(int a, int b) {
        int summ = 0;
        if (b < 0) {
            for (int i = 0; i > b; i--) {
                summ -= a;
            }
        } else if (b > 0) {
            for (int i = 0; i < b; i++) {
                summ += a;
            }
        } else {
            summ = 0;
        }
        System.out.println(summ);
        return summ;
    }
}

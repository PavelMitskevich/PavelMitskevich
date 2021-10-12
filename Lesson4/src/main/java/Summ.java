public class Summ {
    public static void main(String[] args) {
        summ(4, 8);
    }

    public static int summ(int a, int b) {
        int summ = 0;
        for (int i = 0; i < b; i++) {
            summ += a;
        }
        System.out.println(summ);
        return summ;
    }
}

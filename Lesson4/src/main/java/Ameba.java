public class Ameba {
    public static void main(String[] args) {
        ameba();
    }

    public static void ameba() {
        int count = 1;
        for (int i = 3; i < 25; i += 3) {
            count = count * 2;
            System.out.println("Через " + i + " часа количество амёб будет равно " + count);
        }
    }
}

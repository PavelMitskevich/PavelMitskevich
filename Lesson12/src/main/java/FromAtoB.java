public class FromAtoB {
    public static String cutLine(String str) {
        return str.substring(str.indexOf('A'), str.indexOf('B') + 1);
    }

    public static void main(String[] args) {
        System.out.println(cutLine("sdAsdvfBklkB"));
    }
}

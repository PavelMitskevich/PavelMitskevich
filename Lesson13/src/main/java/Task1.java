public class Task1 {
    public static String twoMiddle(String str) {
        int averageLength = str.length() / 2;
        if (str.length() % 2 == 1 || str.length() == 0) {
            try {
                throw new Exception("Incorrect value");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        } else {
            return str.substring(averageLength - 1, averageLength + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(twoMiddle("string"));
        System.out.println(twoMiddle("Practice"));
        System.out.println(twoMiddle("code"));
        System.out.println(twoMiddle("acode"));
    }
}

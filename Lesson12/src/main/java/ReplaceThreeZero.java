public class ReplaceThreeZero {
    public static String replaceThreeZero(String str) {
        if (str.length() < 4) {
            try {
                throw new ArrayIndexOutOfBoundsException("Error " + "'" + str + "'");
            } catch (ArrayIndexOutOfBoundsException e) {
                return e.getMessage();
            }
        }
        char temp;
        char[] chars = str.toCharArray();
        temp = chars[0];
        chars[0] = chars[3];
        chars[3] = temp;
        str = new String(chars);
        return str;
    }

    public static void main(String[] args) {
        System.out.println(replaceThreeZero("IvankoI"));
        System.out.println(replaceThreeZero("sd"));
        System.out.println(replaceThreeZero(""));
        System.out.println(replaceThreeZero("sds"));
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static final Pattern PATTERN = Pattern.compile("c+ab");

    public static String findRegex(String str) {
        Matcher matcher = PATTERN.matcher(str);
        List<String> stringList = new ArrayList<>();

        while (matcher.find()) {
            stringList.add(matcher.group());
            System.out.println(matcher.group());
        }
        return stringList.toString();
    }

    public static void main(String[] args) {
        System.out.println(findRegex("cab, ccab, cccab"));
    }

}

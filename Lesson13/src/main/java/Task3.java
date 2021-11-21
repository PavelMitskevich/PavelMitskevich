import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static final Pattern PATTERN = Pattern.compile("Java\\s+\\d+");

    public static String javaVersions(String str) {
        Matcher matcher = PATTERN.matcher(str);
        List<String> stringList = new ArrayList<>();

        while (matcher.find()) {
            stringList.add(matcher.group());
        }
        return stringList.toString();
    }

    public static void main(String[] args) {
        System.out.println(javaVersions("Versions: Java    5, Java    6, Java     7, Java 8, Java 10."));
    }
}

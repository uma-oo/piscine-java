import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatch {
    public static boolean containsOnlyAlpha(String s) {
        // your code here
        Pattern p = Pattern.compile("\\p{Alpha}+");
        Matcher m = p.matcher(s);
        return m.matches();

    }

    public static boolean startWithLetterAndEndWithNumber(String s) {
        // your code here
        Pattern p = Pattern.compile("^\\w(.*)\\d$");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    public static boolean containsAtLeast3SuccessiveA(String s) {
        // your code here
        Pattern p =Pattern.compile(".*AAA.*"); 
        Matcher m = p.matcher(s); 
        return m.matches(); 
    }
}
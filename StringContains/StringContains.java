
public class StringContains {
    public static boolean isStringContainedIn(String subString, String s) {
        if (subString == null || s == null) {
            return false;
        }
        // your code here
        return s.contains(subString);
    }
}
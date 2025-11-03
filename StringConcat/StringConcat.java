
public class StringConcat {
    public static String concat(String s1, String s2) {

        if (s1 == null) {
            return s2;
        }

        if (s2 == null) {
            return s1;
        }
        // your code here
        return s1 + s1;
    }
}
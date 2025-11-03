import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class CleanExtract {
    public static String extract(String s) {
        // your code here
        ArrayList<String> result = new ArrayList<>();
        String[] subStrings = s.split("\\|");
        // System.out.println(subStrings);
        for (String subString : subStrings) {
            Boolean start = false;
            int startIndex = 0;
            int endIndex = 0;
            for (int i = 0; i < subString.length(); i++) {
                // System.out.println(i);
                if (subString.charAt(i) == '.' && !start) {
                    // System.out.println("hunaaaa");
                    startIndex = i;
                    // System.out.println(i);
                    start = true;
                } else if (start && subString.charAt(i) == '.') {
                    endIndex = i;
                }
            }

            // System.out.println(startIndex);
            if (start && startIndex < endIndex) {
                result.add(subString.substring(startIndex + 1, endIndex).trim());
            }

            // System.out.println(startIndex);
            if (start && endIndex == 0) {
                result.add(subString.substring(startIndex + 1, subString.length() - 1).trim());
            }

            if (!start) {
                result.add(subString.trim());
            }

        }

        // System.out.println(result);

        return String.join(" ", result);
    }
}
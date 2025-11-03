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
            String subResult = new String();
            for (int i = 0; i < subString.length(); i++) {
                // System.out.println(i);
                if (subString.charAt(i) == '.' && !start) {
                    startIndex = i;
                    start = true;
                } else if (start && subString.charAt(i) == '.') {
                    endIndex = i;
                }
            }

            // System.out.println(startIndex);
            if (start && startIndex < endIndex) {
                subResult = subString.substring(startIndex + 1, endIndex).strip() ;
            }

            // System.out.println(startIndex);
            if (start && endIndex == 0) {
                subResult = subString.substring(startIndex + 1, subString.length()).strip();
            }

            if (!start) {
                subResult = subString.strip();
            }
            if (subResult != "") {
                result.add(subResult);
            }

        }

        // System.out.println(result);

        return String.join(" ", result);
    }
}
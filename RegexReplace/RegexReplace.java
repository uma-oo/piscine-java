import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexReplace {
    public static String removeUnits(String s) {
        if (s == null) {
            return null;
        }
        String[] words = s.split(" ");
        List<String> wordsRe = new ArrayList<>();
        for (String word : words) {
            Pattern p = Pattern.compile("((\\d+cm)|(\\d+€))");
            Matcher m = p.matcher(word);
            if (m.matches()) {
                wordsRe.add(word.replaceAll("cm|€", ""));
            } else {
                wordsRe.add(word);
            }

        }

        return String.join(" ", wordsRe);

    }

    public static String obfuscateEmail(String s) {
        List<String> result = new ArrayList<>();

        if (s == null) {
            return null;
        }
        String[] emailParts = s.split("@");
        String username = emailParts[0];
        String domain = emailParts[1];
        Pattern p = Pattern.compile("(?<=\\.|-|_).*");
        Matcher m = p.matcher(username);
        if (m.find()) {
            int startIndex = m.start();
            int endIndex = m.end();
            StringBuilder sb = new StringBuilder(username);
            for (int i = startIndex; i < endIndex; i++) {
                sb.setCharAt(i, '*');
            }
            username = sb.toString();

            result.add(username);
        } else if (username.length() > 3) {
            StringBuilder sb = new StringBuilder(username);
            for (int i = 3; i < username.length(); i++) {
                sb.setCharAt(i, '*');
            }
            username = sb.toString();
            result.add(username);
        } else {
            result.add(username);
        }

        result.add("@");

        // treat the email again
        String[] domainParts = domain.split("\\.");
        String first = domainParts[0];
        StringBuilder sb = new StringBuilder(first);
        for (int i = 0; i < domainParts[0].length(); i++) {
            sb.setCharAt(i, '*');
        }
        first = sb.toString() + ".";
        result.add(first);

        if (domainParts.length == 2) {
            if (!domainParts[1].matches("^(com|org|net)$")) {
                result.add(domainParts[1].replaceAll(".", "*"));
            } else {
                result.add(domainParts[1]);
            }
        }

        if (domainParts.length == 3) {
            result.add(domainParts[1] + ".");
            result.add(domainParts[2].replaceAll(".", "*"));
        }

        return String.join("", result);

    }
}

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        LocalDateTime dateFormatted = LocalDateTime.parse(stringDate);
        return dateFormatted;

    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("EEEE dd MMMM yyyy")
                .toFormatter(Locale.ENGLISH);
        LocalDate localDate = LocalDate.parse(stringDate, formatter);

        return localDate;
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        boolean isEvening = false;
        if (stringDate.toLowerCase().contains("evening")) {
            isEvening = true;
        }

        Pattern integerPattern = Pattern.compile("\\d+");
        Matcher integerMatcher = integerPattern.matcher(stringDate);

        List<Integer> digits = new ArrayList<>();
        while (integerMatcher.find()) {
            digits.add(Integer.valueOf(integerMatcher.group()));
        }

        if (isEvening) {
            digits.set(0, digits.get(0) + 12);
        }

        return LocalTime.of(digits.get(0), digits.get(1), digits.get(2));

    }

}
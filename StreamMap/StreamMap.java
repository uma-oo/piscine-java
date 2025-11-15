import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;;

public class StreamMap {
    public static Integer sumOfStringLength(Stream<String> s) {
        // your code here
        return s.map(String::length).reduce(0, Integer::sum); 
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        // your code here
        List<String> words = s.map(String::toUpperCase).collect(Collectors.toList()); 
        return words; 
    }
    
    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        // your code here
        return s.map(number-> Integer.valueOf(number.intValue())).filter(number -> number >= 42).collect(Collectors.toSet());
    }
}
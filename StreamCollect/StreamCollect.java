


import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StreamCollect {
    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
        // your code here
        Map<Character, List<String>> dictionary = new HashMap<>();
        List<String> words = s.collect(Collectors.toList());
        for (String word : words) {
            process(dictionary, word);
        }

        return dictionary;
    }

    public static void process(Map<Character, List<String>> dict, String word) {
        List<String> value = dict.getOrDefault(Character.toUpperCase(word.charAt(0)), new ArrayList<>());
        value.add(word);
        dict.put(Character.toUpperCase(word.charAt(0)), value);
    }

    // public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
    //     // your code here
    // }

    public static String orderAndConcatWithSharp(Stream<String> s) {
        // your code here

        s.map()
    }
}

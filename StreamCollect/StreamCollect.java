
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
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

    public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
        // your code here
        Map<Integer, Optional<Integer>> dict = new HashMap<>();
        List<Integer> numbers = s.collect(Collectors.toList());
        for (Integer number : numbers) {
            switch (number % 4) {
                case 0:
                    processNumbers(0, dict, number);
                    break;
                case 1:
                    processNumbers(1, dict, number);
                    break;
                case 2:
                    processNumbers(2, dict, number);
                    break;
                case 3:
                    processNumbers(3, dict, number);
                    break;

            }
        }

        return dict;

    }

    public static void processNumbers(Integer key, Map<Integer, Optional<Integer>> dict, Integer number) {
        Optional<Integer> value = dict.get(key);
        if (value != null && value.isPresent()) {
            if (value.get() < number) {
                dict.put(key, Optional.of(number));
                return;
            }
        }

        if (value == null || !value.isPresent()) {
            dict.put(key, Optional.of(number));
            return;
        }
    }

    public static String orderAndConcatWithSharp(Stream<String> s) {
        // your code here

        String[] words = s.toArray(String[]::new);
        Arrays.sort(words);
        return "{" + String.join(" # ", words) + "}";

    }
}

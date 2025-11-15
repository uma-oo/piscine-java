
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.List;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        // your code here
        List<String> firstList = new ArrayList<>(first);
        List<String> secondList = new ArrayList<>(second);
        Map<String, String> couples = new HashMap<>();

        while (firstList.size() != 0 && secondList.size() != 0) {
            Random random = new Random();

            int firstRand = random.nextInt(firstList.size());
            int secondRand = random.nextInt(secondList.size());
            couples.put(firstList.get(firstRand), secondList.get(secondRand));
            firstList.remove(firstRand);
            secondList.remove(secondRand);
        }
        return couples;

    }
}


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        // your code here
        List<Integer> coinsArr = new ArrayList<>(coins);
        Collections.sort(coinsArr, Comparator.reverseOrder());
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < coinsArr.size(); i++) {
            if (amount >= coinsArr.get(i)) {
                result.add(coinsArr.get(i));
                amount = amount - coinsArr.get(i); 
                i = -1;
            }
        }

        return result;
    }
}

import java.util.ArrayList;
import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        // your code here
        if (list == null) {
            return null;
        }
        List<Integer> result = new ArrayList<>(list);

        for (int i = 0; i < result.size(); i++) {
            if (i + 1 < result.size() && result.get(i) > result.get(i + 1)) {
                Integer temp = result.get(i);
                result.set(i, result.get(i + 1));
                result.set(i + 1, temp);
                i = -1;
            }
        }

        return result;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        // your code here
        if (list == null) {
            return null;
        }
        List<Integer> result = new ArrayList<>(list);

        for (int i = 0; i < result.size(); i++) {
            if (i + 1 < result.size() && result.get(i) < result.get(i + 1)) {
                Integer temp = result.get(i);
                result.set(i, result.get(i + 1));
                result.set(i + 1, temp);
                i = -1;
            }
        }

        return result;
    }
}
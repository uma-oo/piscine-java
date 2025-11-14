
import java.util.ArrayList;
import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        // your code here
        
        for (int i = 0; i < list.size(); i++) {
            if (i + 1 < list.size() && list.get(i) > list.get(i + 1)) {
                Integer temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
                i = -1;
            }
        }

        return list;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        // your code here
        
        for (int i = 0; i < list.size(); i++) {
            if (i + 1 < list.size() && list.get(i) < list.get(i + 1)) {
                Integer temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
                i = -1;
            }
        }

        return list;
    }
}
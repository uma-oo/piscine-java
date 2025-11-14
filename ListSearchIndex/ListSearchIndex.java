
import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        // your code here
        Integer index = null ;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                index = i;
            }
        }
        return index;
    }

    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        // your code here
        // your code here
        Integer index = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                return i;
            }
        }
        return index;
    }

    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        // your code here

        List<Integer> listAll = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                listAll.add(i);
            }
        }

        return listAll;

    }
}
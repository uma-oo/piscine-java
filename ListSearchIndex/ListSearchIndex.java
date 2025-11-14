
import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        // your code here
        Integer index = null ;
        if (list == null) {
            return index; 
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                index = i;
            }
        }
        return index;
    }

    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        // your code here
        // your code here
        Integer index = null;
        if (list == null) {
            return index; 
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                return i;
            }
        }
        return index;
    }

    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        // your code here

        if (list == null) {
            return null; 
        }

        List<Integer> listAll = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                listAll.add(i);
            }
        }

        return listAll;

    }
}
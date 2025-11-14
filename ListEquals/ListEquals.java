
import java.util.List;

public class ListEquals {
    public static boolean areListsEqual(List<String> list1, List<String> list2) {

        if (list1 == list2 && list1 == null) {
            return true;
        }

        if (list1 == null || list2 == null) {
            return false;
        }
        // your code here

        return list1.equals(list2);
    }
}

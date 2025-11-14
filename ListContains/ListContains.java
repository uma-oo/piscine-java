
import java.util.List;

public class ListContains {
    public static boolean containsValue(List<Integer> list, Integer value) {
        // your code here

        for (Integer element : list) {
            if (element.equals(value)) {
                return true;
            }
        }

        return false; 
    }
}
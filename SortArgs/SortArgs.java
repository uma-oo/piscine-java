import java.util.List;
import java.util.stream.Collectors;

public class SortArgs {
    public static void sort(String[] args) {
        if (args.length ==0) {
             System.out.print("\n");
        }
        // your code here
        List<Integer> result = java.util.Arrays.stream(args).map(number -> Integer.valueOf(number)).sorted()
                .collect(Collectors.toList());

        for (int i = 0; i < result.size(); i++) {
            if (i != result.size() - 1) {
                System.out.print(result.get(i) + " ");
            } else {
                System.out.print(result.get(i) + "\n");
            }
        }

    }
}
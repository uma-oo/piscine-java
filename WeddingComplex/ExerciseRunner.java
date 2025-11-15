


import java.util.List;
import java.util.Map;

public class ExerciseRunner {

    public static void main(String[] args) {
         Map<String, List<String>> men = Map.of("Naruto", List.of("Sakura", "Hinata"), "Sasuke",
                List.of("Sakura", "Hinata"));
        Map<String, List<String>> women = Map.of("Sakura", List.of("Sasuke", "Naruto"), "Hinata",
                List.of("Naruto", "Sasuke"));
        


        System.out.println(WeddingComplex.createBestCouple(men , women)); 
    }
}
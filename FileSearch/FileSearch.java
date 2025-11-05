import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileSearch {
    public static String searchFile(String fileName) {
        // your code here
        Path root = Paths.get("documents");
        int maxDepth = Integer.MAX_VALUE;
        try {
            List<String> paths = Files.walk(root, maxDepth).map(path -> path.toString()).collect(Collectors.toList());
            for (String path : paths) {
                if (path.endsWith(fileName)) {
                    return path;
                }
            }
        } catch (Exception e) {
            return  ""; 
        }

        return "";
    }
}

import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        // your code here
        // let's use the scanner thing as i'm used to it

        Path filePath = Paths.get(args[0]);
        Scanner scanner = new Scanner(filePath);
        OutputStream writer = new FileOutputStream(args[1]);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s+");
            ArrayList<String> newWords = new ArrayList<>();

            for (String word : words) {
                if (word.length() > 0) {
                    newWords.add(Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase());
                } 
            }
            String newLine = String.join(" ", newWords);
            writer.write(newLine.getBytes());
        }

    }
}

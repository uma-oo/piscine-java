
import java.io.*;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {

        File newFile = new File(fileName);
        OutputStream writer = new FileOutputStream(newFile);
        writer.write(content.getBytes());
        // your code here
    }

    public static String getContentFile(String fileName) throws IOException {
        // your code here
        InputStream reader = new FileInputStream(fileName);
        byte[] bytes = reader.readAllBytes();
        return new String(bytes); 
    }

    public static void deleteFile(String fileName) {
        // your code here
        Path path = Paths.get(fileName);
        path.toFile().delete();
    }
}
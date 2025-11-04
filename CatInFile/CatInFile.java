
import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        // your code here

        for (String fileName : args) {
            OutputStream writer = new FileOutputStream(fileName);
            byte[] buf = new byte[1024];
            int readBytes;
            while ((readBytes = System.in.read(buf)) != -1) {
                writer.write(buf, 0, readBytes);
            }

            writer.close();

        }

    }
}
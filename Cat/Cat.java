
import java.io.*;

public class Cat {
    public static void cat(String[] args) throws IOException {
        // your code here

        for (String fileName : args) {
            FileInputStream reader = new FileInputStream(fileName);
            System.out.write(reader.readAllBytes());
            int bytesRead;
            byte[] buff = new byte[1024];
            while ((bytesRead = reader.read(buff)) != -1) {
                System.out.write(buff, 0, bytesRead);
            }

            reader.close();

        }

    }
}
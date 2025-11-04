
import java.io.*;


public class Cat {
    public static void cat(String[] args) throws IOException {
        // your code here

        for (String fileName : args) {
            FileInputStream reader = new FileInputStream(fileName);
            byte [] buff = new byte[1024];
            while (reader.read(buff) !=-1) {
                System.out.write(buff);
            }

            reader.close();

        }

    }
}
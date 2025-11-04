
import java.io.*;
import java.nio.charset.StandardCharsets;


public class Cat {
    public static void cat(String[] args) throws IOException {
        // your code here

        for (String fileName : args) {
            FileInputStream reader = new FileInputStream(fileName);
            byte [] buff = new byte[1024];
            int bytesRead ; 
            while ((bytesRead = reader.read(buff))!=-1) {
                System.out.print(new String(buff, 0, bytesRead, StandardCharsets.UTF_8));
            }

            reader.close();

        }

    }
}
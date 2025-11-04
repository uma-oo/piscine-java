
import java.io.*;


public class Cat {
    public static void cat(String[] args) throws IOException {
        // your code here

        for (String fileName : args) {
            InputStream inputStream = new FileInputStream(fileName);
            int data; 
            while ((data = inputStream.read()) != -1) {
                
                System.out.print((char)data);
            }

            inputStream.close();

        }

    }
}
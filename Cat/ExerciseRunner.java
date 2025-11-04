
import java.io.*;
import java.util.Random;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        PrintStream stdout = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Cat.cat(new String[] { "input.txt" });
        String output = outputStream.toString();
        // Reset out to stdout
        System.setOut(stdout);
        System.out.println("output: " + output);
        System.out.println(output.equals("\n"));

        ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();
        PrintStream printStream2 = new PrintStream(outputStream2);
        System.setOut(printStream2);

        Cat.cat(new String[] {});
        String output2 = outputStream2.toString();
        // Reset out to stdout
        System.setOut(stdout);
        System.out.println(output2.equals(""));
        generateBinaryFile("gi.txt", 1024*1024*2);
    }

    public static void generateBinaryFile(String filePath, int fileSizeInBytes) throws IOException {
        FileOutputStream fos = new FileOutputStream(filePath);
        Random random = new Random();

        byte[] buffer = new byte[1024]; // Adjust buffer size as needed
        while (fileSizeInBytes > 0) {
            random.nextBytes(buffer);
            int bytesToWrite = Math.min(fileSizeInBytes, buffer.length);
            fos.write(buffer, 0, bytesToWrite);
            fileSizeInBytes -= bytesToWrite;
        }
    }

}
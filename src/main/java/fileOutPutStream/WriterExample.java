package fileOutPutStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("D:/output.txt");
            String content = "I am enjoying java training very much!";

            writer.write(content);
            writer.close();
            System.out.println("Success...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

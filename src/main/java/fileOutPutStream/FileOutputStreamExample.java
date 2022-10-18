package fileOutPutStream;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String args[]){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("D:/testout.txt");
            String text = "Hello Elvis, welcome to your file data!";

            byte message[] = text.getBytes(); // Convert string into byte array
            fileOutputStream.write(message);
            fileOutputStream.close();
            System.out.println("success...");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

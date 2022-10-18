package fileOutPutStream;

import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String args[]){
        try{
            FileWriter fileWriter = new FileWriter("D:/testout.txt");

            fileWriter.write("Welcome to java Training.");

            fileWriter.close();

            System.out.println("Success...");

        }catch(Exception e){
            System.out.println(e);
        }
    }
}

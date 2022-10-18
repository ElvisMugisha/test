package fileOutPutStream;

import java.io.FileReader;

public class FileReaderExample {
    public static void main(String args[])throws Exception{
        FileReader fileReader = new FileReader("D:/testout.txt");
        int i;

        while ((i = fileReader.read()) != -1) {
            System.out.print((char) i);
        }
        fileReader.close();
    }
}

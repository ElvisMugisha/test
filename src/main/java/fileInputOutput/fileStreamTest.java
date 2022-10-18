package fileInputOutput;

import java.io.*;

public class fileStreamTest {
    public static void main(String args[]) {
        try {
            byte bWrite [] = {11,21,3,40,5};
            OutputStream os = new FileOutputStream("C:/java/test.txt");
            for(int x = 0; x < bWrite.length ; x++) {
//                System.out.print(bWrite[x]);
                os.write( bWrite[x] ); // writes the bytes
            }
            os.close();
            InputStream is = new FileInputStream("C:/java/elvis.txt");
            int size = is.available();
            for(int i = 0; i < size; i++) {
                System.out.print(is.read() + " ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print(e);
        }
    }
}

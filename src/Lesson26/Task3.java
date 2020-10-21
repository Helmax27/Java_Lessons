package Lesson26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileIn = new FileInputStream("C:\\Users\\helen\\IdeaProjects\\TestOlena\\test11.png");
        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\helen\\IdeaProjects\\TestOlena\\test22.png");

        while (fileIn.available() > 0) {
            int oneByte = fileIn.read();
            fileOut.write(oneByte);
        }
        fileIn.close();
        fileOut.close();

        FileInputStream fInput=new FileInputStream("C:\\Users\\helen\\IdeaProjects\\TestOlena\\Notes.txt");
        while (fInput.available()>0) {
            int i=fInput.read();
            System.out.print((char)i);
        }

    }
}

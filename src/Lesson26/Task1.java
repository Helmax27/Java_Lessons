package Lesson26;

import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File fileToCreation = new File("C:\\Users\\helen\\IdeaProjects\\TestOlena\\Task_test2.txt");
        boolean cr=false;
        if (cr) System.out.println("There is the file");

        FileReader frtest = new FileReader("Task_test1");
        char[] buf = new char[512];
        int ch;
        while ((ch = frtest.read(buf))>0) {
            System.out.print(buf);
        }
        System.out.println();
        System.out.println("'Task_test1' file read");
        buf = new char[512];

        FileWriter fwtest=new FileWriter("Task_test2.txt", false);
        String text = "New file!!";
        fwtest.write(text);
        fwtest.append("\n");
        fwtest.append("Helen ");
        fwtest.flush();

        FileReader frtest1 = new FileReader("Task_test2.txt");
        while ((ch = frtest1.read(buf))>0) {
            System.out.print(buf);
        }
        System.out.println();
        System.out.println("'Task_test2' file read");
    }
}

package Lesson23;

import java.io.*;
import java.util.stream.Stream;

public class Task7 {
    public static void main(String[] args) throws IOException {
        File newFile = new File("new_1");
        System.out.println(newFile.getName());
        System.out.println("File size: " + newFile.length());
        System.out.println(newFile.getParent());
        if (newFile.exists()) System.out.println("File exists");
        if (newFile.canWrite()) System.out.println("I can write");


        File fileToCreate = new File("C:\\Users\\helen\\IdeaProjects\\TestOlena\\123.txt");
        boolean created = false;
        try {
            created = fileToCreate.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (created) System.out.println("File created");

        FileReader fr = new FileReader("new_1");
        int ch;
        char[] buffer = new char[512];
        while ((ch=fr.read(buffer)) > 0){
            System.out.print(buffer);
        }

        FileWriter fw = new FileWriter("123.txt");
        String text = "Test file writer!!";
        fw.write(text);
        fw.append("\n");
        fw.append("sdfsdfds");

        fw.flush();
        System.out.println(" \n");
        FileReader reader = new FileReader("123.txt");
        char[] buf = new char[512];
        while ((ch = reader.read(buf))>0) {
            System.out.print(buf);
        }






    }
}

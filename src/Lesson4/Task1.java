package Lesson4;

public class Task1 {
    public static void main(String[] args) {
        char [] m=new char [26];
        for (int i=0; i<26; i++) {
            m[i]=(char) ('a' + i);
            System.out.print(m[i]+"");
        }
    }
}

package Lesson1;

public class Task9 {
    public static void main(String[] args) {
        int length=5;
        for (int i=1; i<=length; i++) {
            for (int x=5; x>=i; x--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

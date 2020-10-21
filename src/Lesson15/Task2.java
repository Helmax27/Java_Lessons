package Lesson15;

public class Task2 {
    public static void main(String[] args) {
        double n=256;
        double p=24;
        defDegree(n);
        defDegree(p);


    }

    public static void defDegree(double n) {
        if (n == 1) {
            System.out.println("Является степенью 2");
        } else if (n > 1 && n < 2) {
            System.out.println("Не является степенью 2");
        } else {
            defDegree(n / 2);
        }
    }

}

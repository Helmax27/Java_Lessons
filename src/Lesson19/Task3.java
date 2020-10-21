package Lesson19;

public class Task3 {

    public static void main(String[] args) {
        Check(1);
        Check(0);
        Check(true);

    }

    public static void Check(Object o) {
        if (o instanceof Boolean) {
            if ((Boolean) o)
                System.out.println("False");
            else System.out.println("True");
        }
        if (o instanceof Integer) {
            if (o.equals(0)) {
                System.out.println("True");
            } else System.out.println("False");
        }
    }

    public static <T> void checkVar(T e) {
        if (e instanceof Boolean) {
            if ((Boolean) e) {
                System.out.println("False");
            }
        }
    }

}

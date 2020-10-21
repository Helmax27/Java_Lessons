package Lesson14;

public class Task1 {
    public static void main(String[] args) {
        Verification(20);
        Verification("Public");
        Verification(10f);
        Verification(20.5);

    }
    public static void Verification (Object o) {
        if (o instanceof Integer) {
            Integer i=(Integer) o;
            System.out.println("Type integer: "+i);
        } else if (o instanceof Double) {
            Double d=(Double) o;
            System.out.println("Type double: "+ d);
        } else if (o instanceof  String) {
            String s=(String) o;
            System.out.println("Type String; "+ s);
        } else {
            System.out.println("This type is not provided by the program");
        }
    }
}

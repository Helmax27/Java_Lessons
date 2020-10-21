package Lesson14;

public class Task3 {
    public static void main(String[] args) {
        Validation(25, 26);
        Validation(28, 26.8);
        Validation(31.0, 89.1);
        Validation(25.7, 26);

    }

    public static void Validation(Object o, Object b) {
        if (o instanceof Integer && b instanceof Integer) {
            Integer i = (Integer) o;
            Integer d = (Integer) b;
            System.out.println("The sum of the integer values is:  " + (i + d));
        } else {
            Double i;
            if (o instanceof Integer) {
                i = (double) ((int) o);
                Double d = (double) b;
                System.out.println("The sum of double values is: " + (i + d));
            } else if (o instanceof Double && b instanceof Double){
                i = (double) o;
                Double d = (double) b;
                System.out.println("The sum of double values is: " + (i + d));
            } else {
                Double d= (double) ((int) b);
                i = (double) o;
                System.out.println("The sum of double values is: " + (i + d));
            }
        }

    }
}

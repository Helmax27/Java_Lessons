package Lesson15;

public class Task3 {
    public static void main(String[] args) {
        String n = "123456";
        System.out.println(n);
        System.out.println(reversNumber(n));
        /*if (n.length() != 0) {
            System.out.println(reversNumber(n));

        }*/
        System.out.println();
        int a = 123456;
        System.out.print(reverseInt(a));

    }

    public static String reversNumber(String y) {
        String temp;
        if (y.length() == 0){
            return y;
        }
        if (y.length() == 1) {
            //System.out.print(y);
            return y;
        } else {
            temp = y.substring(y.length()-1) + y.substring(1,y.length()-1)+ y.substring(0, 1);
            y = temp;
            /*y = y.substring(y.length() - 1);
            y.substring(y.length() - 1) = temp;
            System.out.print(y.substring(y.length() - 1));*/
            return reversNumber(y.substring(1, y.length() - 1));
        }
    }

    public static int reverseInt(int n){
        if (n<10){
            return n;
        }
        else{
            System.out.print(n%10 + " ");
            return reverseInt(n/10);
        }
    }
}
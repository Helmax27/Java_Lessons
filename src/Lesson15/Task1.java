package Lesson15;

public class Task1 {
    public static void isPalindromeLoop(String s){
        boolean t = true;
        int n=s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                t = false;
            }
        }
        if (t) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }

    public static String isPalindromRecursive(String s){
        if (s.length() ==  1){
            return "Palindrom";
        } else {
            if (s.substring(0,1).equals(s.substring(s.length()-1))){
                if (s.length() == 2){
                    return "Palindrom";
                }
                return isPalindromRecursive(s.substring(1,s.length()-1));
            } else return "Is not palindrom";
        }
    }

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Madam");
        StringBuffer buffer1 = buffer.reverse();
        if (buffer.equals(buffer1)) {
            System.out.println("Палиндром");
        }
        String s="Madam";
        System.out.println(isPalindromRecursive(s.toLowerCase()));

        String t="Аэродром";
        System.out.println(isPalindromRecursive(t.toLowerCase()));

    }

}

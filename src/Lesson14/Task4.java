package Lesson14;

public class Task4 {
    public static void main(String[] args) {
        String str1 = "Good morning";
        String str2 = "a";
        SumCode(str1);
        SumCode(str2);
    }

    public static void SumCode(String str) {
        int sumcode = 0;
        char[] strToArray = str.toCharArray();
        for (int i = 0; i < strToArray.length; i++) {
            int code = (int) ((char) strToArray[i]);
            sumcode = sumcode + code;
        }
        System.out.println(sumcode);
    }
}

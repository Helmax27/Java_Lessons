package Lesson4;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {2, 8, 1, 6, 12, 1, 14, 18};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                for (int j = i + 1; j < array.length; j++) {
                    sum = sum + array[j];
                }
                break;
            }
        }
        System.out.println("Sum= " + sum);
    }
}

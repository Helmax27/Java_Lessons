package Lesson4;

public class Task8 {
    public static void main(String[] args) {
        int[] array={1, -2, 3, -8, 7};
        int sum=0;
        for (int i=0; i<array.length; i++) {
            if (array[i]>0) {
                sum+=array[i];
            }
        }
        System.out.println("Sum= " + sum);
    }
}

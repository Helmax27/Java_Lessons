package Lesson4;

public class Task11 {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 8, 3, 5, 2, 7, 9};
        int t;
        for (int i=0; i<array.length/2; i++) {
            t=array[array.length-i-1];
            array[array.length-i-1]=array[i];
            array[i]=t;
        }
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]);
        }
    }
}

package Lesson4;

public class Task2 {
    public static void main(String[] args) {
        int[] array={2,8,6,12,14,18};
        int min=Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
          min= Math.min(min, array[i]) ;
        }
        System.out.println("Min element " + min);
    }
}

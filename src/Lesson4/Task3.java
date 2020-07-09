package Lesson4;

public class Task3 {
    public static void main(String[] args) {
        int[] array={2,8,6,12,14,18};
        int max=Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            max= Math.max(max, array[i]) ;
        }
        System.out.println("Max element " + max);
    }
}

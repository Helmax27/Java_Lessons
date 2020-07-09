package Lesson4;

public class Task5 {
    public static void main(String[] args) {
        int[][] array = {{2, 8, 1, 6}, {2, 3, 5, 7}, {3, 6, 3,0}, {7, 8, 6, 10}};
        int min=Integer.MAX_VALUE;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                if (i==j){
                    min=Math.min(min, array[i][j]);
                }
            }
        }
        System.out.println("Min element " + min);
    }
}

package Lesson4;

public class Task6 {
    public static void main(String[] args) {
        int[][][] array = new int[3][3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = 1;
                    System.out.print(array[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

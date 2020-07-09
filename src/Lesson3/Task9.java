package Lesson3;

public class Task9 {
    public static void main(String[] args) {
        int[][] array1 = {{5, 2, 4, 8, 6}, {2, 6, 5, 9, 10}, {1, 2, 3, 4, 6}};
        int[][] array2 = {{6, 2, 9, 8, 16}, {20, 6, 25, 9, 10}, {1, 32, 3, 41, 6}};
        int[][] array3 = new int [3][5];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array3[i][j]=array1[i][j]*array2[i][j];
                System.out.print(array3[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

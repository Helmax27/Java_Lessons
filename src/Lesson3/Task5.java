package Lesson3;

public class Task5 {
    public static void main(String[] args) {
        int[][] array = {{5, 2, 4, 8, 6}, {2, 6, 5, 9, 10}, {1, 2, 3, 4, 6}};
        int[] sum = new int[3];
        int s;
        int l = 0;
        for (int i = 0; i < array[0].length; i++) {
            if (i % 2 == 0) {
                s = 0;
                for (int j = 0; j < array.length; j++) {
                    s += array[j][i];
                }
                sum[l] = s;
                l++;
            }
        }
        for (int i = 0; i < sum.length - 1; i++) {
            if (sum[i] > sum[i + 1]) {
                for (int j = 0; j < array.length; j++) {
                    int temp = array[i][j];
                    array[i][j] = array[i + 1][j];
                    array[i + 1][j] = temp;
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}



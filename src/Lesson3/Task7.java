package Lesson3;

public class Task7 {
    public static void main(String[] args) {
        int[][] array = {{5, 2, 4, 8, 6}, {2, 6, 5, 9, 10}, {1, 2, 3, 4, 6}};
        int l = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    l = l + 1;
                }
            }
        }
        System.out.println(l);
    }
}

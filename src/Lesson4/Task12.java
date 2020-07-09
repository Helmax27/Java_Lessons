package Lesson4;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 8, 3, 5, 2, 7, 9};
        int t = 1;
        for (int i=0; i<t; i++) {
            int tmp = array[0];
            for (int j= 0; j < array.length - 1; j++)
                array[j] = array [j+1];
            array[array.length-1] = tmp;
        }
            System.out.println(Arrays.toString(array));
    }
}

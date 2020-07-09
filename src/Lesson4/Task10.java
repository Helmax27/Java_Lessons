package Lesson4;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] array = {5,1,4,8,3,5,2,7};
        Arrays.sort(array);
        for (int i=array.length-3; i<array.length; i++)
            System.out.print(array[i]);
    }
}

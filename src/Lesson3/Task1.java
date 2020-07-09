package Lesson3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int [][] array={{5,2},{8,9},{2,4},{2,6}};
        for (int k=0; k<array.length; k++) {
            for (int i=0; i<array.length; i++) {
                for (int j=0; j<array[i].length-1; j++) {

                    if (array[i][j]< array[i][j+1]) {
                        int temp=array[i][j];
                        array[i][j]=array[i][j+1];
                        array[i][j+1]=temp;
                    }
                }
            }
        }
        for (int i=0; i<array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

package Lesson3;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = {{5, 2, 4, 8, 6}, {2, 6, 5, 9, 10}};
        for (int k=0; k<array.length+1; k++) {
            for (int i=0; i<array.length-1; i++) {
                for (int j=0; j<array[i].length-1; j++) {
                    if ((array[i][j]+array[i+1][j])<(array[i][j+1]+array[i+1][j+1])) {
                        int temp1=array[i][j];
                        array[i][j]=array[i][j+1];
                        array[i][j+1]=temp1;
                        int temp2=array[i+1][j];
                        array[i+1][j]=array[i+1][j+1];
                        array[i+1][j+1]=temp2;
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

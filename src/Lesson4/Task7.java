package Lesson4;

public class Task7 {
    public static void main(String[] args) {
        int[] array={1,1,1,1,2};
        boolean one=true;
        for (int i=0; i<array.length-1; i++) {
            if (array[i]!=array[i+1]) {
                one=false;
            }
        }
        System.out.println(one);
    }
}

package Lesson2;

public class Task10 {
    public static void main(String[] args) {
        int nums[] = {11, 0, 8, 9, 4, 7, 0, 14, 13, 58};
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                total = total + 1;
        }
        System.out.println("Total amount:" + total);
    }
}

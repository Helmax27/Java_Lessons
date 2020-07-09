package Lesson2;

public class Task7 {
    public static void main(String[] args) {
        int nums[] = {11, 6, 8, 9, 4, 7, 12, 14, 13, 58};
        int total = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            total = total + nums[i];
            System.out.println("amount:" + total);
        }
        System.out.println("Total amount:" + total);
    }
}

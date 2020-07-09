package Lesson2;

public class Task2 {
    public static void main(String[] args){
        int nums[]={11,6,8,9,4,7,12,14,13,58};
        int max=nums[0];
        for (int i=1; i<nums.length; i++) {
            if (nums[i]>max) max=nums[i];
        }
        System.out.println(("Max element:"+max));
    }
}

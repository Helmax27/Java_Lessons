package Lesson2;

public class Task1 {
    public static void main(String[] args){
        int nums[]={11,6,8,9,4,7,12,14,13,58};
        int min=nums[0];
        for (int i=1; i<nums.length; i++) {
            if (nums[i]<min) min=nums[i];
        }
        System.out.println(("Min element:"+min));
    }
}

package Lesson1;

public class Task6 {
    public static void main(String[] args){
      int month=12;
      if (month==12 | month==1 | month==2) {
          System.out.println("Winter");
      } else if (month==3 | month==4 | month==5) {
          System.out.println("Spring");
      } else  if (month==6 | month==7 | month==8) {
          System.out.println("Summer");
      } else {
          System.out.println("Autumn");
      }
    }
}

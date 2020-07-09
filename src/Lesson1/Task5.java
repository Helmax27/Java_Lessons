package Lesson1;

public class Task5 {
    public static void main(String[] args) {
        short season='4';
        switch(season) {
            case '1':
                System.out.println("Winter");
                break;
            case '2':
                System.out.println("Spring");
                break;
            case '3':
                System.out.println("Summer");
                break;
            default:
                System.out.println("Autumn");
        }
    }
}

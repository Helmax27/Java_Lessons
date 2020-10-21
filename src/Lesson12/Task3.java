package Lesson12;

public class Task3 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();

        } catch (Exception e){
            System.out.println("Учи математику!");
            throw e;

        }
        finally{
            System.out.println("Ready!");
        }


    }


}

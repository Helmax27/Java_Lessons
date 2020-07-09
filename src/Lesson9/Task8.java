package Lesson9;

public class Task8 {

    public static void main(String[] args) {

        Kolibry kolibry = new Kolibry();
        kolibry.setAge(10);
        kolibry.setMassa(200);
    }





}

interface Flyable{
    int age = 10;
    int mass = 200;
    public void fly();
}

abstract class Bird {
    private int age;
    private int massa;

    public abstract void fly();

    public int getAge() {
        return age;
    }

    public int getMassa() {
        return massa;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
}

class Kolibry extends Bird {

    @Override
    public void fly() {
        System.out.println("Полетели");
    }



}


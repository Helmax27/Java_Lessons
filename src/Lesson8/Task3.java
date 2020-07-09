package Lesson8;

public class Task3 {
    public static void main(String[] args) {
        Force value = new Force();
        value.health = 72;
        value.age = 5;
        value.displayInfo();
        int sumrezult = value.Summa(value.health, value.age);
        System.out.println(sumrezult);
        int maxrezult= value.Max(value.health, value.age);
        System.out.println(maxrezult);
    }
}
class Force {
    int health, age, mv, sm;

    void displayInfo() {
        System.out.printf("%d %d\n", health, age);
    }
    int Summa (int health, int age) {
       return sm=health+age;
    }
    int Max (int health, int age) {
        if (health> age) {
            mv=health;
        }
        else {
            mv = age;
        }
        return mv;
    }
}
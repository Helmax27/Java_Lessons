package Lesson8;

public class Task2 {
    public static void main(String[] args) {
        Monster person = new Monster();
        person.name = "Stas";
        person.health = 5;
        person.attackPower = 14.1;
        person.defensePower = 14.2;
        person.displayInfo();
    }
}
class Monster {
    String name;
    int health;
    double attackPower, defensePower;
    void displayInfo() {
        System.out.printf("%s %d %.1f %.1f%n",name, health, defensePower, attackPower);
    }
}

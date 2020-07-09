package Lesson8;

public class Task1 {
        public static void main(String[] args) {
            Human person = new Human();
            person.name = "Sergey";
            person.surname = "Kolomoyski";
            person.age = 14;
            person.gender = true;
            person.displayInfo();
        }
}
class Human {
    String name, surname;
    int age;
    boolean gender;
    void displayInfo() {
        System.out.printf("%s %s %d %B",name, surname, age, gender);
    }
}
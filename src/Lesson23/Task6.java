package Lesson23;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task6 {
    public static void main(String[] args) {
        Stream<Person> persons = Stream.of(new Person("Alex", "male", "1970-10-22"),
                new Person("Leonid", "male", "1950-02-11"),
                new Person("Viktor", "male", "1945-02-20"),
                new Person("Valentina", "female", "1950-03-29"),
                new Person("Svetlana", "female", "1938-11-11"),
                new Person("Tatiana", "female", "2005-07-04"),
                new Person("Boris", "male", "1899-02-01"),
                new Person("Vasia", "male", "2020-03-21"),
                new Person("Nora", "female", "1902-05-25"),
                new Person("Semen", "male", "2071-08-27"));

        //Stream<Person> filteredPersons = persons.filter(person -> ((LocalDate.now().isAfter(LocalDate.now().minusYears(120))) &&
                //((person.getDateOfBirth().isBefore(LocalDate.now())))));
        List<Person> personList= persons.filter(person -> ((person.getDateOfBirth().isAfter(LocalDate.now().minusYears(120)))
                &&((person.getDateOfBirth().isBefore(LocalDate.now()))))).collect(Collectors.toList());
        System.out.println("Person after date check");
        personList.forEach(System.out::println);
        List<Person> adults=personList.stream().filter(human-> (human.getDateOfBirth().isBefore(LocalDate.now().minusYears(18)))).collect(Collectors.toList());
        System.out.println("Adults:");
        adults.forEach(System.out::println);
        List<Person> pensioners = personList.stream().filter(men -> (((men.getGender().equals("female") && (men.getDateOfBirth().isBefore((LocalDate.now().minusYears(60))))) ||
                (men.getGender().equals("male") && (men.getDateOfBirth().isBefore((LocalDate.now().minusYears(65)))))))).collect(Collectors.toList());
        System.out.println("Pensioners:");
        pensioners.forEach(System.out::println);

    }
}

class Person {
    public String name;
    public String gender;
    public LocalDate dateOfBirth;
    boolean isRetired;

    public Person(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
        if (gender == "male" && this.dateOfBirth.isAfter(LocalDate.now().minusYears(60))) {
            this.isRetired = true;
        } else {
            this.isRetired = false;
        }
    }

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void CheckDate(LocalDate dateOfBirth) {
        try {
            if ((LocalDate.now().getYear() - getDateOfBirth().getYear()) > 120) {
                System.out.println("Date of birth is incorrect. It is more then 120 years" + getName() + ' ' + getGender() + ' ' + getDateOfBirth());
            } else if ((LocalDate.now().getYear() - getDateOfBirth().getYear()) < 0) {
                System.out.println("Date of birth is incorrect. It is feature" + getName() + ' ' + getGender() + ' ' + getDateOfBirth());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

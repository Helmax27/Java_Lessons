package Lesson8;


import java.util.Arrays;
import java.util.Objects;

public class Task4 {
    public static void main(String[] args) {
        Students listStudent[] = {
                new Students("Ivanov", 11, new int[]{5, 4, 4, 5, 5}),
                new Students("Petrov", 11, new int[]{3, 3, 4, 4, 3}),
                new Students("Pytin", 10, new int[]{2, 3, 4, 3, 5}),
                new Students("Timaty", 3, new int[]{5, 4, 5, 5, 4}),
                new Students("Loiko", 11, new int[]{5, 4, 3, 2, 3}),
                new Students("Izov", 12, new int[]{4, 4, 3, 5, 4}),
                new Students("Kolosov", 3, new int[]{4, 5, 4, 5, 4})};
        for (int i = 0; i < listStudent.length; i++) {
            Students temp = null;
            for (int j = i + 1; j < listStudent.length; j++) {
                if (listStudent[j].avarage < listStudent[i].avarage) {
                    temp = listStudent[i];
                    listStudent[i] = listStudent[j];
                    listStudent[j] = temp;
                }
            }
        }
        for (Students student : listStudent) {
            System.out.println(student.toString());
        }
        System.out.println();
        for (Students student : listStudent) {
            String temp = null;
            for (int perf : student.academPerfomance) {
                if (perf < 4) {
                    temp = student.name;
                }
            }
            if (temp == null) {
                student.displayInfo();

            }
        }
    }

}

class Students {
    public String name;
    public int groupNumber;
    public int academPerfomance[] = new int[5];
    public double avarage;

    Students(String name, int groupNumber, int[] academPerfomance) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.academPerfomance = academPerfomance;

        for (int i = 0; i < academPerfomance.length; i++) {
            avarage += academPerfomance[i];
        }
        this.avarage /= 5;
    }


    void displayInfo() {
        String tmp = "";
        for (int perf : academPerfomance) {
            tmp += perf + " ";
        }
        System.out.println("name " + name + "groupnumber " + groupNumber + "marks: " + tmp + "avarage " + avarage);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students)) return false;
        Students students = (Students) o;
        return groupNumber == students.groupNumber &&
                Double.compare(students.avarage, avarage) == 0 &&
                Objects.equals(name, students.name) &&
                Arrays.equals(academPerfomance, students.academPerfomance);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, groupNumber, avarage);
        result = 31 * result + Arrays.hashCode(academPerfomance);
        return result;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", groupNumber=" + groupNumber +
                ", academPerfomance=" + Arrays.toString(academPerfomance) +
                ", avarage=" + avarage +
                '}';
    }
}

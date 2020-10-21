package Lesson27;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();
        Person[] person = gson.fromJson(new FileReader("C:\\Users\\helen\\IdeaProjects\\TestOlena\\src\\Lesson27\\expense.json"), Person[].class);
        List<Week> weeks = new ArrayList<>();
        List<Expense> expenses = new ArrayList<>();
        for (Person p : person) {
            for (Week wk : p.week) {
                weeks.add(wk);
                for (Expense ex : wk.expense) {
                    expenses.add(ex);
                }
            }
            System.out.println(p);
        }
        //List person1 = Arrays.asList(person);

        /*double maxBear = 0;
        double maxCar = 0;
        double maxFood = 0;
        double total = 0;*/

        Person drinker = person[0];
        Person driver = person[0];
        Person objora = person[0];
        Person major = person[0];

       /* String personBear = "null";
        String personCar = "null";
        String personFood = "null";
        String personTotal = "null";
        int maxIndex[] = new int[4];*/
        for (int i = 1; i < person.length; i++) {

            person[i].countBeer();
            person[i].countCar();
            person[i].countFood();
            person[i].totalSum = person[i].sumBear + person[i].sumFood + person[i].sumCar;
            if (person[i].sumBear > drinker.sumBear) {
                drinker = person[i];
               /* maxBear = person[i].sumBear;
                personBear = person[i].who;
                maxIndex[Person.maxBearIndex] = i;*/
            }
            if (person[i].sumCar > driver.sumCar) {
                driver = person[i];
                /*maxCar = person[i].sumCar;
                personCar = person[i].who;
                maxIndex[Person.maxCarIndex] = i;*/
            }
            if (person[i].sumFood > objora.sumFood) {
                objora=person[i];
                /*maxFood = person[i].sumFood;
                personFood = person[i].who;
                maxIndex[Person.maxFoodIndex] = i;*/

            }
            if (person[i].totalSum > major.totalSum) {
                major = person[i];
               /* total = person[i].totalSum;
                personTotal = person[i].who;
                maxIndex[Person.maxTotalIndex] = i;*/
            }
        }
        //System.out.println(person[Person.maxBearIndex].who + personBear + " Max Bear= " + maxBear + "\n" + personCar + " Max Car= " + maxCar + "\n" + personFood + " Max Food= " + maxFood + "\n"
//                + personTotal + " Max Total= " + total);

        System.out.println(drinker.who + " Max Beer= " + drinker.sumBear + "\n" + driver.who + " Max Car= " + driver.sumCar + "\n" + objora.who + " Max Food= " + objora.sumFood + "\n"
        + major.who + " Max Total= " + major.totalSum);
    }
}

class RunThread extends Thread {
    @Override
    public void run() {
    }
}

class Person {
    public String who;
    public List<Week> week;
    double sumBear;
    double sumCar;
    double sumFood;
    double totalSum;

    public Person(String who, List<Week> week) {
        this.who = who;
        this.week = week;
    }

    public void countBeer() {
        for (Week w : week) {
            for (Expense ex : w.expense) {
                if (ex.what.equals("Beer")) {
                    this.sumBear += ex.amount;
                }
            }
        }
    }

    public void countCar() {
        for (Week w : week) {
            for (Expense ex : w.expense) {
                if (ex.what.equals("Car")) {
                    this.sumCar += ex.amount;
                }
            }
        }
    }

    public void countFood() {
        for (Week w : week) {
            for (Expense ex : w.expense) {
                if (ex.what.equals("Food")) {
                    this.sumFood += ex.amount;
                }
            }
        }
    }

    public String getWho() {
        return who;
    }

    public List<Week> getWeek() {
        return week;
    }

    @Override
    public String toString() {
        return "Person " + " who='" + who + '\'' + ", week=" + week + " Total Bear= " + sumBear + " Total Car= " + sumCar
                + " Total Food= " + sumFood;
    }

   /* public static final int maxBearIndex;

    static {
        maxBearIndex = 0;
    }

    public static final int maxFoodIndex;

    static {
        maxFoodIndex = 1;
    }

    public static final int maxCarIndex;

    static {
        maxCarIndex = 2;
    }

    public static final int maxTotalIndex;

    static {
        maxTotalIndex = 3;
    }*/
}

class Week {
    public int number;
    public List<Expense> expense;

    public Week(int number, List<Expense> expense) {
        this.number = number;
        this.expense = expense;
    }

    public int getNumber() {
        return number;
    }

    public List<Expense> getExpense() {
        return expense;
    }

    @Override
    public String toString() {
        return "Week " + "number=" + number + ", expense=" + expense;
    }
}

class Expense {
    public String what;
    public double amount;

    public Expense(String what, double amount) {
        this.what = what;
        this.amount = amount;
    }

    public String getWhat() {
        return what;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Expense{" + "what='" + what + '\'' + ", amount=" + amount + '}';
    }
}
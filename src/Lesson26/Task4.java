package Lesson26;

import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) throws IOException, ParseException {
        Object taskObj = new JSONParser().parse(new FileReader("C:\\Users\\helen\\IdeaProjects\\TestOlena\\src\\Lesson26\\task.json"));
        JSONArray jsob = (JSONArray) taskObj;
        Iterator orgIterator = jsob.iterator();
        System.out.println("Organisations: ");
        while (orgIterator.hasNext()) {
            JSONObject org = (JSONObject) orgIterator.next();
            System.out.println("name " + org.get("organization"));
            JSONArray emp = (JSONArray) org.get("employees");
            Iterator empIterator = emp.iterator();
            System.out.println("Employees: ");
            while (empIterator.hasNext()) {
                JSONObject employee = (JSONObject) empIterator.next();
                System.out.println(employee.get("name"));
            }
        }


        Gson gson = new Gson();
        Organization[] organizations = gson.fromJson(new FileReader("C:\\Users\\helen\\IdeaProjects\\TestOlena\\src\\Lesson26\\task.json"), Organization[].class);
        System.out.println(organizations[0].employees);
        System.out.println(organizations[1].employees);
        List<Employees> emp = new ArrayList<>();
        //  emp.addAll(organizations[0].employees);
        //emp.addAll(organizations[1].employees);
        System.out.println("--------------------");
        for (Organization org : organizations) {
            //emp.addAll(org.employees);
            for (Employees employer : org.employees) {
                emp.add(employer);
            }
        }
        System.out.println(emp);
        System.out.println("Pensioners:");
        Stream<Employees> str = emp.stream().filter(human -> LocalDate.parse(human.getDateOfBirth()).isBefore(LocalDate.now().minusYears(60)));
        str.forEach(System.out::println);
    }
}

class Organization {
    public String organization;
    public Address addres;
    public List<Employees> employees;
    public int numberOfRooms;
    public String type;

    public Organization(String nameOrganigation, int numberOfRooms, String companyType, Address address, List<Employees> employees) {
        this.organization = nameOrganigation;
        this.numberOfRooms = numberOfRooms;
        this.type = companyType;
        this.addres = address;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Organization \n" + organization +
                "\n number of rooms: " + numberOfRooms +
                ", company type: " + type +
                "\n address: " + addres +
                "\n employees: " + employees;
    }
}

class Address {
    public String street;
    public String city;
    public String phone;

    public Address(String street, String city, String phone) {
        this.street = street;
        this.city = city;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Address:\n" +
                " street: " + street +
                ", city: " + city +
                ", phone: " + phone;
    }
}

class Employees {
    public String name;
    public String dateOfBirth;
    public String position;
    public String gender;

    public Employees(String name, String dateOfBirth, String position, String gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPosition() {
        return position;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Employees " +
                "name: " + name +
                ", dateOfBirth " + dateOfBirth +
                ", position: " + position +
                ", gender: " + gender + "\n";
    }
}

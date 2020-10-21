package Lesson26;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.json.simple.*;
import org.json.simple.parser.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException, ParseException {
        Object obj = new JSONParser().parse(new FileReader("C:\\Users\\helen\\IdeaProjects\\TestOlena\\src\\Lesson26\\test.json"));
        JSONObject jo = (JSONObject)obj;

        String name = (String) jo.get("name");
        long age = (long) jo.get("age");
        System.out.println(name);
        System.out.println(age);


        Object example_obj = new JSONParser().parse(new FileReader("C:\\Users\\helen\\IdeaProjects\\TestOlena\\src\\Lesson26\\example.json"));
        JSONObject json = (JSONObject) example_obj;
        JSONArray phoneNumbers = (JSONArray) json.get("phoneNumbers");
        Iterator phoneIterator = phoneNumbers.iterator();
        System.out.println("Phone numbers: ");
        while (phoneIterator.hasNext()){
            JSONObject number = (JSONObject) phoneIterator.next();
            System.out.println("type: " + number.get("type") + "\nnumber: " + number);
        }

        System.out.println("Gson:");
        Gson gson = new Gson();
        Person person = gson.fromJson(new FileReader("C:\\Users\\helen\\IdeaProjects\\TestOlena\\src\\Lesson26\\example.json"), Person.class);
        System.out.println(person);
        for (Person frienf: person.friends){
            System.out.println(frienf);
        }
    }
}

class Person{
    public String firstName;
    public String lastName;
    public int age;
    public Adress address;
    public List<Phones> phones;
    public List<Person> friends;


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", phones=" + phones +
                ", friends=" + friends +
                '}';
    }
}

class Adress{
    public String streetAddress;
    public String city;
    public String state;
    public int postalCode;

}

class Phones{
    public String type;
    public String number;
}

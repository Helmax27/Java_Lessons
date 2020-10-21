package Lesson23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        //Pattern pattern = Pattern.compile("aplit", Pattern.CASE_INSENSITIVE);
        String pattern = "19";
        //Matcher matcher = pattern.matcher("Hello Apit!");
        String test = "Hello Apit19";
        System.out.println(test.replace(pattern, "!"));
        if (test.toLowerCase().contains("aplit")){
            System.out.println("Sovpalo");
        } else System.out.println("Ne Sovpalo");
    }
}




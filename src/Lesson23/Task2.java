package Lesson23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Privet", "kak", "dela");

        list.forEach(s -> System.out.println(s));
        /*list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        list.forEach(System.out::println );
        for (String s : list) {
            System.out.println(s);
        }

    }

}

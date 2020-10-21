package Lesson15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<String>();
        countries.add("Germany");
        countries.add("Spain");
        countries.add("Italy");
        countries.add("Montenegro");

        System.out.println(countries);
        countries.add("Spain");
        System.out.println(countries);
        System.out.println(countries.contains("Spain"));
        countries.remove("Germany");
        System.out.println(countries);

        Iterator<String> iter = countries.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        for (String c: countries){
            System.out.println(c);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);

        Integer[] array = new Integer[]{1,2,3,4,5,6,7};

        int a = array[0];
        //String b = arr.get(1);
        array[0] = 9;
        arr.set(0, 9);
        int count = array.length;
        int size = arr.size();



        Iterator<Integer> intIterator = arr.iterator();
        while (intIterator.hasNext()){
            System.out.println(intIterator.next());
        }



    }

}

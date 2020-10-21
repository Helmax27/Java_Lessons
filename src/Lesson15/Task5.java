package Lesson15;

//import java.util.HashSet;
import java.util.*;
//import java.util.Set;
//import java.util.TreeSet;

public class Task5 {
    public static void main(String[] args) {
        HashSet<Integer> intHashSet = new HashSet<Integer>();
        intHashSet.add(23);
        intHashSet.add(11);
        intHashSet.add(33);
        intHashSet.add(24);
        intHashSet.add(22);
        for (int i : intHashSet)
            System.out.print(i + " ,");
        System.out.println();
        System.out.println("Now intHashSet size is: " + intHashSet.size());

        HashSet clonHashSet = new HashSet();
        clonHashSet = (HashSet) intHashSet.clone();
        System.out.println("The new set: " + clonHashSet);

        boolean value = intHashSet.equals(clonHashSet);
        System.out.println("Are both set equal: " + value);

        TreeSet<Integer> convertSet = new TreeSet<Integer>(intHashSet);
        System.out.println("TreeSet: " + convertSet);


        System.out.println("The first element is: " + convertSet.first());
        System.out.println("The last element is: " + convertSet.last());

        intHashSet.clear();
        System.out.println("Now intHashSet sizi is: " + intHashSet.size());

    }
}

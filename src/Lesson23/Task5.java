package Lesson23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> intNumbers = new ArrayList<>();
        intNumbers.add(2);
        intNumbers.add(211);
        intNumbers.add(21);
        intNumbers.add(72);
        intNumbers.add(52);
        intNumbers.add(25);
        intNumbers.add(22);
        intNumbers.add(3);
        intNumbers.add(6);

        int sum = 0;
        for(int i: intNumbers){
            if(i%2 == 0){
                sum +=i;
            }
        }

        intNumbers.stream();
        Stream.of("a1", "a2", "a3");
        String[] array = {"a1", "a2", "a3"};
        Arrays.stream(array);
        Files.lines(Paths.get("file.txt"));
        String s = "123";
        IntStream streamFromString = s.chars();
        Stream.iterate(1, n -> n + 1);
        Stream.generate(() -> "a1");
        Integer sumStream = intNumbers.stream().distinct().skip(2).filter(i -> i % 2 == 0).reduce((s1,s2) -> s1 + s2).orElse(0);
        Integer sumStream1 = intNumbers.parallelStream().filter(i -> i % 2 == 0).reduce((s1,s2) -> s1 + s2).orElse(0);

        System.out.println(sum);
        System.out.println(sumStream);
    }
}

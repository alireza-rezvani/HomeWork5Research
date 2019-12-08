package ir.maktab32.java.projects.homework5.research;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //anyMatch Example
        System.out.println("\u2705 anyMatch Example:");
        Predicate<String> predicate = s -> s.length()>5;

        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("Ali");
        strings1.add("Ahmad");
        strings1.add("Reza");
        strings1.add("Hamid");
        boolean result = strings1.stream().anyMatch(predicate);
        System.out.println("\t\u29bf strings1 Result for anyMatch: " + result);

        ArrayList<String> strings2 = new ArrayList<>();
        strings2.add("Alireza");
        strings2.add("Ahmad");
        strings2.add("Reza");
        strings2.add("Hamid");
        result = strings2.stream().anyMatch(predicate);
        System.out.println("\t\u29bf strings2 Result for anyMatch: " + result);


        //reduce Example
        System.out.println("\n\u2705 anyMatch Example:");
        int[] numbers = {5,2,9,0,-3,140};
        Arrays.stream(numbers).reduce((x, y) -> x + y).ifPresent(res -> System.out.println("\t\u29bf Sum: " + res));


        //peek example
        System.out.println("\n\u2705 peek Example:");
        Stream.of("ali", "reza", "alireza")
                .peek(s -> System.out.println("\n\t\u29bf Before filter: " + s))
                .filter(s -> s.length() > 3)
                .peek(s -> System.out.println("\t\u29bf After length filter: " + s))
                .map(s -> s.toUpperCase())
                .peek(s -> System.out.println("\t\u29bf After map: " + s))
                .collect(Collectors.toList()); // will not print anything without this terminal operation.


    }
}

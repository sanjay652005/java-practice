package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {

        // Lambda expression
        MyInterface obj = () -> System.out.println("Sum: " + (10 + 4));
        obj.sayhello();

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 1);

        // Count even numbers
        long count = list.stream()
                         .filter(i -> i % 2 == 0)
                         .count();
        System.out.println("Even count: " + count);

        // Multiply by 10 and collect into Set
        Set<Integer> result = list.stream()
                                 .map(i -> i * 10)
                                 .collect(Collectors.toSet());
        System.out.println("Multiplied Set: " + result);

        // Remove duplicates and sort
        list.stream()
            .distinct()
            .sorted()
            .forEach(System.out::println);

        // Sum using reduce
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        // Method reference
        list.forEach(System.out::println);
    }
}
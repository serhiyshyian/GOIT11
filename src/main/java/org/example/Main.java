package org.example;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Ivan", "Peter", "Maria", "John", "Alice");
        String result1 = NameUtils.getOddIndexedNames(names);
        System.out.println("Задание 1: " + result1);


        List<String> strings = List.of("apple", "orange", "banana", "grape");
        List<String> result2 = StringUtils.sortAndUpperCase(strings);
        System.out.println("Задание 2: " + result2);


        String[] inputArray = {"1, 2, 0", "4, 5"};
        String result3 = NumberUtils.extractAndSortNumbers(inputArray);
        System.out.println("Задание 3: " + result3);


        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        Stream<Long> randomStream = LinearCongruentialGenerator.generate(a, c, m, 5);
        System.out.println("Задание 4:");
        randomStream.forEach(System.out::println);


        Stream<String> stream1 = Stream.of("a", "b", "c", "d");
        Stream<String> stream2 = Stream.of("1", "2", "3");
        Stream<String> zippedStream = StreamUtils.zip(stream1, stream2);
        System.out.print("Задание 5: ");
        zippedStream.forEach(item -> System.out.print(item + " "));
    }
}

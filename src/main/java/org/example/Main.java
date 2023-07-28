package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ivan", "Peter", "Maria", "John");
        String result1 = NameUtils.getOddIndexedNames(names);
        System.out.println("Задание 1: " + result1); // Output: "1. Ivan, 3. Maria"


        List<String> strings = Arrays.asList("apple", "orange", "banana", "grape");
        List<String> result2 = StringUtils.sortAndUpperCase(strings);
        System.out.println("Задание 2: " + result2); // Output: [ORANGE, GRAPE, BANANA, APPLE]


        String[] inputArray = {"1, 2, 0", "4, 5"};
        String result3 = NumberUtils.extractAndSortNumbers(inputArray);
        System.out.println("Задание 3: " + result3); // Output: "0, 1, 2, 4, 5"


        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        Stream<Long> randomStream = LinearCongruentialGenerator.generate(1L, a, c, m);
        randomStream.limit(5).forEach(System.out::println);


        Stream<String> stream1 = Stream.of("a", "b", "c", "d");
        Stream<String> stream2 = Stream.of("1", "2", "3");
        Stream<String> zippedStream = StreamUtils.zip(stream1, stream2);
        System.out.print("Задание 5: ");
        zippedStream.forEach(item -> System.out.print(item + " ")); // Output: a 1 b 2 c 3
    }
}

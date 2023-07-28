package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberUtils {
    public static String extractAndSortNumbers(String[] inputArray) {
        List<Integer> numbers = Arrays.stream(inputArray)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
        return numbers.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String[] inputArray = {"1, 2, 0", "4, 5"};
        String result = extractAndSortNumbers(inputArray);
        System.out.println(result); // Output: "0, 1, 2, 4, 5"
    }
}


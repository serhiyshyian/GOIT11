package org.example;


import java.util.Arrays;
import java.util.stream.Collectors;

public class NumberUtils {
    public static String extractAndSortNumbers(String[] inputArray) {
        return Arrays.stream(inputArray)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String[] inputArray = {"1, 2, 0", "4, 5"};
        String result = extractAndSortNumbers(inputArray);
        System.out.println(result); // Output: "0, 1, 2, 4, 5"
    }
}



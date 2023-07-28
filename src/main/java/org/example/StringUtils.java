package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {
    public static List<String> sortAndUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = List.of("apple", "orange", "banana", "grape");
        List<String> result = sortAndUpperCase(strings);
        System.out.println(result); // Output: [ORANGE, GRAPE, BANANA, APPLE]
    }
}

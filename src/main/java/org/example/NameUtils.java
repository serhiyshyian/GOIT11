package org.example;

import java.util.List;

public class NameUtils {
    public static String getOddIndexedNames(List<String> names) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < names.size(); i++) {
            if (i % 2 == 0) {
                result.append(i + 1).append(". ").append(names.get(i)).append(", ");
            }
        }
                if (result.length() > 2) {
            result.setLength(result.length() - 2);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Peter", "Maria", "John");
        String result = getOddIndexedNames(names);
        System.out.println(result);
    }
}


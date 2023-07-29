package org.example;

import java.util.stream.Stream;

public class LinearCongruentialGenerator {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        generate(a, c, m, 5).forEach(System.out::println);
    }

    public static Stream<Long> generate(long a, long c, long m, int limit) {
        return Stream.iterate(1L, x -> (a * x + c) % m).limit(limit);
    }
}

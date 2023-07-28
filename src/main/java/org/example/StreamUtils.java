package org.example;

import java.util.Iterator;
import java.util.stream.Stream;

public class StreamUtils {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();

        Stream.Builder<T> builder = Stream.builder();

        while (iterator1.hasNext() && iterator2.hasNext()) {
            builder.accept(iterator1.next());
            builder.accept(iterator2.next());
        }

        return builder.build();
    }

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("a", "b", "c", "d");
        Stream<String> stream2 = Stream.of("1", "2", "3");
        Stream<String> zippedStream = zip(stream1, stream2);
        System.out.print("Задание 5: ");
        zippedStream.forEach(item -> System.out.print(item + " ")); // Output: a 1 b 2 c 3
    }
}



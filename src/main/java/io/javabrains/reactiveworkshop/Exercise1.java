package io.javabrains.reactiveworkshop;

import java.util.stream.Stream;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()
        Stream<Integer> intStream = StreamSources.intNumbersStream();
        Stream<User> names = StreamSources.userStream();
        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        intStream.forEach(System.out::println);

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        StreamSources.intNumbersStream().filter(a -> a < 5).forEach(System.out::println);

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        StreamSources.intNumbersStream().filter(a -> a > 5).skip(1).limit(2).forEach(System.out::println);

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        System.out.println(StreamSources.intNumbersStream().filter(a -> a > 5).findFirst().orElse(-1));

        // Print first names of all users in userStream
        // TODO: Write code here
        names.forEach(a -> System.out.println(a.getFirstName()));

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        StreamSources.userStream().filter(a -> StreamSources.intNumbersStream().anyMatch(b -> b == a.getId())).forEach(a -> System.out.println(a.getFirstName()));
    }

}

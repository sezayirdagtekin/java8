package com.stream.example;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicates {

  public static void main(String[] args) {

    Consumer<String> consumer = s -> System.out.println(s);
    Stream<String> stream = Stream.of("one", "two", "three", "four", "five");

    Predicate<String> p1 = s -> s.length() > 3;
    Predicate<String> p2 = Predicate.isEqual("two");
    stream.filter(p1.or(p2)).forEach(consumer);

  }

}

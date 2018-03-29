package com.lamda.Predicate;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateLamda {

  public static void main(String[] args) {

    String s1 = "Hello World";

    Predicate<String> p1 = s -> s.length() > 5;

    Consumer<Boolean> consumer = System.out::println;
    consumer.accept(p1.test(s1));
  }

}

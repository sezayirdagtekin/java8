package com.string;

import java.util.StringJoiner;
import java.util.stream.IntStream;

/**
 * 
 * @author dagtekin
 *
 */
public class StringExample {

  public static void main(String[] args) {

    String s = "Hellow orld";
    IntStream stream = s.chars();
    stream.mapToObj(letter -> (char) letter).map(Character::toUpperCase).forEach(System.out::print);

    System.out.println();

    StringJoiner sj = new StringJoiner(",").add("one").add("two").add("three");
    System.out.println(sj.toString());

    String[] tab = {"one", "two", "three"};
    String s2 = String.join(",", tab);
    System.out.println(s2);
  }

}

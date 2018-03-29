package com.lamda.methodrefrence;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * @author dagtekin
 *
 */
public class ComparatorExampleLamda {

  public static void main(String[] args) {


    Comparator<String> comp = (s1, s2) -> Integer.compare(s1.length(), s2.length());

    List<String> list = Arrays.asList("Spring", "C++", "Java", "Angular", "C");
    Collections.sort(list, comp);

    // Method reference
    Consumer<String> consumer = s -> System.out.println(s);

    for (String s : list) {
      consumer.accept(s);
    }
  }

}

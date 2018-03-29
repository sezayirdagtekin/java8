package com.lamda.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExampleLamda {

  public static void main(String[] args) {


    Comparator<String> comp = (s1, s2) -> Integer.compare(s1.length(), s2.length());

    List<String> list = Arrays.asList("Spring", "C++", "Java", "Angular", "C");
    Collections.sort(list, comp);

    for (String s : list) {
      System.out.println(s);
    }
  }

}

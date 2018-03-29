package com.lamda.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

  public static void main(String[] args) {


    Comparator<String> comp = new Comparator<String>() {

      @Override
      public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
      }
    };

    List<String> list = Arrays.asList("Spring", "C++", "Java", "Angular", "C");
    Collections.sort(list, comp);

    for (String s : list) {
      System.out.println(s);
    }
  }

}

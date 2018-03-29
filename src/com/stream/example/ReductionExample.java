package com.stream.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class ReductionExample {

  public static void main(String... args) {

    List<Integer> list = Arrays.asList(1, 2, 3);

    Optional<Integer> min = list.stream().reduce(Integer::min);
    Optional<Integer> max = list.stream().reduce(Integer::max);  
    Optional<Integer> sum = list.stream().reduce(Integer::sum);



    System.out.println("min = " + min);
    System.out.println("max = " + max);
    System.out.println("sum = " + sum);

  }
}

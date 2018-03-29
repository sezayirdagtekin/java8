package com.stream.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class ReductionExample2 {

  public static void main(String... args) {

    List<Integer> list = Arrays.asList(1, 2, 3);

   //int value=list.stream().reduce(0,(a,b)->a+b);
   int value=list.stream().reduce(0,Integer::max);


    System.out.println("sum = " +value);

  }
}

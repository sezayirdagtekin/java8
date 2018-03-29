package com.stream.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.stream.model.Person;


/**
 *
 * @author José
 */
public class CollectorsExample {

  public static void main(String... args) {

    List<Person> persons = new ArrayList<>();
    List<String> list = new ArrayList<>();


    try {

      // 1. filter line 3
      // 2. convert all content to upper case
      // 3. convert it into a List
      Stream<String> stream = Files.lines(Paths.get("D:\\people.txt"));
      
     list= stream.collect(Collectors.toList());
     list.forEach(System.out::println);

    }
    catch (IOException ioe) {
      System.out.println(ioe);
    }
    
  }
}

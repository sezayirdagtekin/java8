package com.lamda.sortingobject;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author dagtekin
 *
 */
public class JavaComparator {

  public static void main(String[] args) {

    Person.initList();
    List<Person> list1 = Person.getList();
    List<Person> list2 = Person.getList();

    // sort using java 7
    sortbyNameWithJava7(list1);
    System.out.println(list1);


    // sort using java 8
    sortbyNameWithJava8(list2);
    System.out.println(list2);



  }

  // sort using java 7
  private static void sortbyNameWithJava7(List<Person> list) {
    Collections.sort(list, new Comparator<Person>() {

      @Override
      public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });

  }

  // sort using java 8
  private static void sortbyNameWithJava8(List<Person> list) {
    Collections.sort(list, (s1, s2) -> s1.getName().compareTo(s2.getName()));
  }


}

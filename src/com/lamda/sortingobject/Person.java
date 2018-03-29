package com.lamda.sortingobject;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author dagtekin
 *
 */
public class Person {


  private String name;
  private int    age;


  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }


  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + "]";
  }


  private static List<Person> list = new ArrayList<>();

  public static List<Person> initList() {
    list.add(create("John", 42));
    list.add(create("Rosie", 30));
    list.add(create("Luis", 18));
    list.add(create("Simon", 67));
    list.add(create("Marcus", 17));
    return list;
  }


  public static Person create(String name, int age) {
    Person ob = new Person();
    ob.setName(name);
    ob.setAge(age);;
    return ob;
  }

  public static List<Person> getList() {
    return list;
  }


}

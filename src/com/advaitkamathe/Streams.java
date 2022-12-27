package com.advaitkamathe;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.print.attribute.HashPrintJobAttributeSet;

public class Streams {

  // Stream API is used to process collections of object.
  // A stream is sequence of objects that support various methods which can be applied to produce the desired result

  // Stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels
  // Streams don't change the original data structure, they only provide the result as per the pipeline methods

  // Advantages of using stream
  // 1) Functional Programming
  // 2) Reduced code
  // 3) Bulk Operation

  // Methods:
  // filter() -> for conditional check
  // forEach() -> for iteration

  public static void main(String[] args) {

    List<String> list = Arrays.asList("John", "Jane", "Joe", "Jack");

    // forEach()
    list.stream().forEach(listItem -> System.out.println(listItem));

    // Sorting
    list.stream().sorted().forEach(listItem -> System.out.println(listItem));
    list.stream().sorted(Comparator.reverseOrder()).forEach(listItem -> System.out.println(listItem));

    Map<Integer, String> map = new HashMap<>();
    map.put(1, "One");
    map.put(2, "Two");
    map.put(3, "Three");
    map.put(4, "Four");

    // forEach()
    map.forEach((key, value) -> System.out.println(key + " -> " + value));
    map.entrySet().stream().forEach((obj) -> System.out.println(obj));

    // filter()
    map.entrySet().stream().filter(key -> key.getKey() % 2 == 0).forEach(obj -> System.out.println(obj));

    // Sorting
    map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
  }
}

package com.advaitkamathe.MapAndFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMap {

  // map() and flatMap() are both intermediate methods and return another stream as part of the output

  // map()
  // Used of transformation
  // Produces single value for each input value
  // One-to-one mapping

  // flatMap()
  // Used for transformation and flattening
  // Takes Stream<Stream<T>> as input and returns Stream<R>
  // Produces multiple values for each input value
  // One-to-many mapping

  public static void main(String args[]) {

    List<Customer> customers = Data.getAll();

    List<String> emails = customers
        .stream()
        .map(customer -> customer.getEmail())
        .collect(Collectors.toList());
    System.out.println(emails);

    List<List<String>> phoneNumbers1 = customers
        .stream()
        .map(customer -> customer.getPhoneNumbers())
        .collect(Collectors.toList());
    System.out.println(phoneNumbers1);

    List<String> phoneNumbers2 = customers
        .stream()
        .flatMap(customer -> customer.getPhoneNumbers().stream())
        .collect(Collectors.toList());
    System.out.println(phoneNumbers2);
  }
}

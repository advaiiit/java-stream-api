package com.advaitkamathe.CustomerData;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Data {

  public static List<Customer> getAll() {
    return Stream.of(
        new Customer(101, "John Doe", "johndoe@gmail.com", Arrays.asList("9876543210", "8976543210")),
        new Customer(102, "Jane Doe", "janedoe@gmail.com", Arrays.asList("7896543210", "6789543210"))
    ).collect(Collectors.toList());
  }
}

package com.advaitkamathe;

import com.advaitkamathe.CustomerData.Customer;
import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

  // A container object which may or may not contain a non-null value
  // If a value is present, isPresent() will return true and get() will return the value

  public static void main(String[] args) {

    Customer customer = new Customer(101, "John Doe", null, Arrays.asList("9876543210", "8976543210"));

    Optional<Object> emptyOptional = Optional.empty();
    System.out.println(emptyOptional);

    // Optional<String> emailOptional = Optional.of(customer.getEmail()); // Gives NullPointerException

    // ofNullable() -> returns empty() Optional object if null else returns value
    Optional<String> emailOptional = Optional.ofNullable(customer.getEmail());
    System.out.println(emailOptional);

  }
}

package com.advaitkamathe;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Reduce {

  // Reduce -> Aggregating data

  // Reduce method
  // reduce(T identity, BinaryOperator<T> accumulator)
  // identity is initial value
  // accumulator is a function for combining two values

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(25, 30, 15, 45);

    Integer sumResult = Stream.of(2, 4, 6, 8)
            .reduce(0, (a, b) -> a + b);
    System.out.println("Sum: " + sumResult);

    Integer maxValue = numbers.stream()
        .reduce(0, (a, b) -> a > b? a : b);
    System.out.println("Max value: " + maxValue);


  }

}

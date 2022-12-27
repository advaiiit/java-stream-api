package com.advaitkamathe;

import java.util.stream.IntStream;

public class ParallelStreams {

  public static void main(String[] args) {

    long start = 0;
    long end = 0;

    start = System.currentTimeMillis();
    IntStream.range(1, 10).forEach(x -> {
      System.out.println("Thread: " + Thread.currentThread().getName() + ": " + x);
    });
    end = System.currentTimeMillis();
    System.out.println("Plain stream took " + (end - start) + " ms");

    System.out.println();

    start = System.currentTimeMillis();
    IntStream.range(1, 10).parallel().forEach(x -> {
      System.out.println("Thread: " + Thread.currentThread().getName() + ": " + x);
    });
    end = System.currentTimeMillis();
    System.out.println("Parallel stream took " + (end - start) + " ms");
  }
}
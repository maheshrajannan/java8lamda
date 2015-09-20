package com.java8.lamda.example.domain;

/**
 * Simple Alternative to Predicate.
 * @author maheshrajannan
 */
public interface MyPredicate<T> {
  public boolean check(T t);
}

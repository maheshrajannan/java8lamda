package com.java8.lambda.example.predicate;

/**
 * Simple Alternative to Predicate.
 * @author maheshrajannan
 */
public interface MyPredicate<T> {
  /**
   * 
   * @param t
   * @return
   */
	public boolean test(T t);
}

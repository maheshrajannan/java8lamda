/**
 * 
 */
package com.java8.lambda.example.domain;

/**
 * @author maheshrajannan
 *
 */
public class DriverPredicate implements MyPredicate<Person> {
	
	private static DriverPredicate driverPredicate = new DriverPredicate();
	
    @Override
    public boolean test(Person p){
      return p.getAge() >=16;
    }
    
    public static MyPredicate<Person> getInstance() {
    	return driverPredicate;
    }
    
  }
